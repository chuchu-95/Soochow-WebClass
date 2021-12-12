const app = Vue.createApp({
    data(){
        return{
            cardNumber : ''
        };
    },
    methods : {
        clearNumber(){
            this.cardNumber = '';
        },
    },
    computed:{
        showNumber(){
            return this.cardNumber.replace(/(.{4})/g, "$1 ");
        }
    },
    watch:{
        cardNumber(newNumber, oldNumber){
            console.log(newNumber);
            console.log(oldNumber);
        }
    }
}).mount('#myVue')