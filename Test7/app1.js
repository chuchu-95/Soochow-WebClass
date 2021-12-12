const app = Vue.createApp({
    data(){
        return{
            count : 0
        };
    },
    methods : {
        add(num) {
            this.count += num;
        },
        substract() {
            this.count --;
        }

    }
}).mount('#myVue')