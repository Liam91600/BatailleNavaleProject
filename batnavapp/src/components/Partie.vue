<template>
  <div class="card" style="width: 18rem">
    <div class="imgcard">
      <img src="@/assets/personne.png" class="card-img-top" />
      <img src="@/assets/personne.png" class="card-img-top" />
    </div>

    <div class="card-body">
      <h5 class="card-title">{{ name }} ({{ id }})</h5>
      <p class="card-text">{{ description }}</p>
      <a @click="rejoindre_partie" class="btn btn-primary">Join</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "LobbyPage",

  props: {
    id: Number,
    name: String,
    description: String,
  },

  methods: {
    rejoindre_partie() {
      this.$router.push({ name: "game" });
    },
  },
};
</script>

<style scoped>
.card {
  border-radius: 20px 20px 20px 20px;
  opacity: 80%;
}

.imgcard {
  display: flex;
  width: 144px;
  height: 144px;
}
</style>
