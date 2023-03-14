<template>
  <div class="bateaux">
    <button
      v-for="bat in this.bateau"
      :key="bat"
      @click="click_prev(bat.taille, bat.nom)"
    >
      <img src="@/assets/bateau_petit.png" alt="bateau" />
      {{ bat.nom }} ({{ bat.taille }})
    </button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      bateau: {
        taille: 0,
        nom: "",
      },
    };
  },

  mounted() {
    console.log("Appel service Rest pour Bateaux");
    const APP_SERVER_URL = "http://127.0.0.1:8080/rest";

    let request = new Request(APP_SERVER_URL + "/bateau/" + "all", {
      method: "GET",
      headers: { "Content-Type": "application/json" },
    });
    fetch(request)
      .then((response) => {
        if (response.ok) {
          return response.json();
        }
      })
      .then((data) => {
        console.log(data);
        this.bateau = data;
      });
  },

  methods: {
    click_prev(taille, nom) {
      this.$emit("click_prev", taille, nom);
    },
  },
};
</script>
