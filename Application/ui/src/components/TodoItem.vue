<template>
    <div class="todoItem">
        <input type="checkbox" v-model="todo.done" @change="updateTodo"> {{ todo.text }}
        <button type="button" @click.prevent="deleteTodo">Borrar</button>
    </div>
</template>

<script>
export default {
    name: 'TodoItem',
    props: [
        'todo'
    ],
    methods: {
        updateTodo() {
            this.$emit('onUpdateTodo', this.todo)
        },
        deleteTodo() {
            this.$emit('onDeleteTodo', this.todo)
        }
    }
}
</script>
