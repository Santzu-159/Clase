function loadJson(url) {
    return fetch(url)
        .then(response => {
        if (response.status == 200) {
            console.log("Todo ha ido bien");
            return response.json();
        } else {
            throw new Error(response.status);
        }
        })
}

loadJson('https://random.dog/woof.json')
    .catch(alert); // Error: 404