<template>
  <div class="form-floating mb-3">
    <input
      type="Pseudo"
      class="form-control"
      id="floatingInput"
      placeholder="example"
      v-model="nom"
    />
    <label for="floatingInput">Pseudo</label>
  </div>
  <div class="form-floating">
    <input
      type="password"
      class="form-control"
      id="floatingPassword"
      placeholder="Password"
    />
    <label for="floatingPassword">Password</label>
  </div>
  <button
    id="loginbutton"
    type="button"
    class="btn btn-outline-primary"
    @click="checkForm"
  >
    Play
  </button>
</template>

<script>
export default {
  name: "LoginPage",

  data() {
    return {
      nom: null,
    };
  },

  methods: {
    checkForm(e) {
      //stocke dans le store
      this.$store.commit("setLeUser", this.nom);
      console.log(this.$store.getters.getLeUser);

      this.$router.push({ name: "home", params: { lenom: this.nom } });

      e.preventDefault();
    },
  },
};
</script>
<style>
.form-floating {
  width: 50vh;
  margin: auto;
}
#loginbutton {
  background: whitesmoke;
  margin: 5vh auto;
  height: 7vh;
  width: 10vh;
}
</style>
