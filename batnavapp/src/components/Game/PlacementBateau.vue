<template>
  <div class="bateaux">
    <button @click="placement">
      <img src="@/assets/bateau_petit.png" alt="" />
    </button>
  </div>
</template>

<script>

export default{
  methods:{
    placement(){
      console.log("placement bateau")
      this.$emit("click_prev")
    }
  }
}</script>
