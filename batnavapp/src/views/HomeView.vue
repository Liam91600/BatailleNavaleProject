<template>

<Titre :msg="'Bienvenue, ' + nom"/>
<NavigationBar/>

<div class="rules">

<ul class="font-monospace">
  <h3> Règles du jeu </h3>
  <li>Au début du jeu, chaque joueur dispose de 2 grilles, l’une
pour placer sa flotte (i.e. ensemble des bateaux), l’autre pour avoir une « mémoire »
des tirs déjà effectués.</li>

  <li>Un à un, les joueurs vont « tirer » sur une case de l’adversaire,
par exemple B.3 ou encore H.8, afin de couler les bateaux adverses.</li>

<li>Un bateau possède des propriétés de défense, la résistance de chaque case constituant le bateau correspond à la longueur initiale de celui-ci </li>

<li>Un bateau possède des propriétés d’attaque, les dégâts infligés par une attaque correspond au nombre de cases, non touchées, constituant le bateau.</li>

<li>Nouveau bateau : Le voilier de plaisance. Un voilier, possède une taille de 1, une résistance de 2, ne peut évidemment pas attaquer et ne doit surtout pas être
détruit. Si par malheur c’était le cas, l’auteur du tir ayant provoqué sa destruction ne pourra jouer durant 3 tours.
A l’initialisation d’une grille, 2 voiliers, sur chacune des grilles des joueurs, sont placés aléatoirement.</li>

<li>Au début d’un tour de jeu, un joueur peut choisir d’attaquer ou, nouveauté, d’effectuer une manœuvre de déplacement
d’un de ses navires</li>


</ul>

</div>
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

<style scoped>

ul{
  /*  text-shadow: 0 0 2px #00fffc, 0 0 30px #00fffc; */
  color: whitesmoke; 
  margin: -50px 200px;
}

li {	
list-style-image: url('@/assets/bateau_petit.png');
}
li:hover {
list-style-image: url('@/assets/explosion_petit.png');
}

.rules{
  font-size: 18px;

}

</style>
