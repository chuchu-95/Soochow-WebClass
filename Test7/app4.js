const app = Vue.createApp({
    data() {
        return {
            question: '',
            answer: '',
            imagePath: '',
            answerStyle : {
                
            }
        };
    },
    watch: {
        question(newQuestion, oldQuestion) {
            if (newQuestion.indexOf("?") > -1) {
                this.getAnswer();
            }
        },
    },
    methods : {
        getAnswer() {
            this.answer = "思考中，请稍后";
            axios.get("https://yesno.wtf/api")
                 .then((response) => {
                  this.answer = response.data.answer;
                  this.imagePath = response.data.image;
                  this.answerStyle = {border: '3px solid blue', backgroundColor: 'blue'};
                })
                .catch((error) => {
                  this.answer = "我不知道";
                });
            }, 
    }
}).mount('#myVue')