import { createStore } from 'vuex'

export default createStore({
  state: {
    leuser : '',
    is_prev : false,
    taille_prev : 0,
    nom_prev : "",
    orientation : 'Horizontal'
  },
  getters: {
    getLeUser(state){
      return state.leuser;
    },
    getIsPrev(state){
      return state.is_prev;
    },
    getTaillePrev(state){
      return state.taille_prev;
    },
    getNomPrev(state){
      return state.nom_prev;
    },
    getOrientation(state){
      return state.orientation;
    }
  },
  mutations: {
    setLeUser(state, nom){
      state.leuser = nom
    },
    setIsPrev(state, bool){
      state.is_prev = bool;

    },
    setTaillePrev(state, taille){
      state.taille_prev = taille;
    },
    setNomPrev(state, nom){
      state.nom_prev = nom;
    },
    setOrientation(state, or){
      state.orientation = or;
    }


  },
  actions: {
  },
  modules: {
  }
})
