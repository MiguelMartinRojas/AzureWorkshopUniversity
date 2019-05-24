<template>
  <div id="app">
	<h1>Hello all :)</h1>
    <Todo />
    <img src="https://media.giphy.com/media/IB9foBA4PVkKA/giphy.gif">
  </div>
</template>

<script>
import Todo from './components/Todo.vue'

export default {
  name: 'app',
  components: {
    Todo
  }
}
</script>

