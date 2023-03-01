<template>

<div class="card" style="width: 18rem;">
  <img src="@/assets/personne.png" class="card-img-top" alt="participants">
  <!-- <img src="@/assets/personne.png" class="card-img-top" alt="participants"> -->
  <div class="card-body">
    <h5 class="card-title">Nom de la partie</h5>
    <p class="card-text">Description de la partie</p>
    <a @click="rejoindre_partie" class="btn btn-primary">Join</a>
  </div>
</div>


</template>

<script>
export default {
  name: "LobbyPage",

  methods:{
    rejoindre_partie(){

    }
  }
};



</script>

<style scoped>
.card{
    border-radius: 20px 20px 20px 20px;
    opacity: 80%;
}
.card-img-top {
    width: 100%;
    height: 15vw;
    object-fit: cover;
}
</style>