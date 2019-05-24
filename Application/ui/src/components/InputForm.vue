<template>
    <div class="input-form">
        <form @submit.prevent="createTodo">
            <input type="text" v-model="text">
            <button type="submit" :disabled="!text">Crear</button>
        </form>
    </div>
</template>

<script>
export default {
    name: 'InputForm',
    data() {
        return {
            text: ''
        }
    },
    methods: {
        createTodo() {
            this.$emit('onCreateTodo', this.text);
        }
    }
}
</script>

