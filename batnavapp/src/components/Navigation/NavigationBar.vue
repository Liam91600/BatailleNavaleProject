<template>

<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" >
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav" style="margin:auto;">
        <img src="@/assets/logonav.png" width="40" height="40" class="d-inline-block" alt="logo navbar" style="margin:0px 50px;">
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
.navbar{
  background-color: rgb(255, 255, 255, 0.8);
 }
</style>
