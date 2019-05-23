<template>
  <div class="todo-item">
    <li>
        <input type="checkbox" :id="todo.id" v-model="todo.completed" @change="todoCompleted">
        <label :for="todo.id">{{ todo.title }}</label>
    </li>
  </div>
</template>

<script>
export default {
  name: 'todo-item',
  props: ['todo'],
  methods: {
      todoCompleted: function () {
          this.$emit('completed')
      }
  }
}
</script>
