<template>

<div class="container">
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <span class="navbar-brand mb-0 h0">
    <img src="@/assets/logonav.png" width="40" height="40" class="d-inline-block align-top" alt="logo navbar">
    Bataille Navbar
  </span>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <Navigation nom="home" label="Home" />
      <Navigation nom="lobby" label="Jouer" />
      <Navigation nom="login" label="Quitter" />
    </div>
  </div>
  </nav>
</div>



</template> 
<script>
import Navigation from "./Navigation.vue";

export default {
  name: "BarreNavigation",
  components: {
    Navigation,
  },
};
</script>

<style>
.container{

 }
</style>
