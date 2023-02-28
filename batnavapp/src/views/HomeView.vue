<template>

<Titre :msg="'Bienvenue, ' + nom"/>
<NavigationBar/>


<div class="points"></div>

</template>

<script>
// @ is an alias to /src
import NavigationBar from '@/components/Navigation/NavigationBar.vue';
import Titre from '@/components/Titre.vue'

export default {
  name: 'HomeView',
  components: {
    Titre,
    NavigationBar
},

  data(){
    return {
      nom:String
    }
  },

  created(){
        this.nom = this.$store.getters.getLeUser
    },
}
</script>

<style>
.points{
background: url('@/assets/bateau.png');
height: 50px;
width: 50px;
}
.points:hover {
background: url('@/assets/explosion.png');
}

</style>
