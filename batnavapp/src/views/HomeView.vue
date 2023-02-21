<template>

<Titre :msg="'Bienvenue, ' + nom"/>
<NavigationBar/>

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
