<template>
  <div class="hello">
    <InputForm @onCreateTodo="createTodo"></InputForm>

    <TodoItem
      v-for="todo in todos" :key="todo.id"
      :todo="todo" @onUpdateTodo="updateTodo" @onDeleteTodo="deleteTodo">
    </TodoItem>

  </div>
</template>

<script>
import axios from 'axios'
import InputForm from '@/components/InputForm.vue'
import TodoItem from '@/components/TodoItem.vue'

export default {
  name: 'HelloWorld',
  components: {
    InputForm,
    TodoItem
  },
  props: {
    msg: String
  },
  data() {
    return {
      todos: []
    }
  },
  methods: {
    async createTodo(text) {
      const { data } = await axios.post('/todos', { text })

      this.todos.push(data)
    },
    updateTodo(todo) {
      axios.patch(`/todos/${todo.id}`, {
        done: todo.done
      })
    },
    async deleteTodo(todo) {
      await axios.delete(`/todos/${todo.id}`)
      this.fetch()
    },
    async fetch() {
      const { data } = await axios.get('/todos')
      this.todos = data._embedded.todos
    }
  },
  async created() {
    this.fetch()
  }
}
</script>

<style scoped>

</style>
