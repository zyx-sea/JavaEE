(function (w, d, u) {
    var form = util.get('form');
    if (!form) {
        return;
    }
    var title = form['title'];
    var abstracts = form['abstracts'];
    var icon = form['icon'];
    var text = form['text'];
    var price = form['price'];
    var isSubmiting = false;
    var imgpre = util.get('imgpre');
    var loading = new Loading();
    var page = {
        init: function () {
            form.addEventListener('submit', function (e) {
                if (!isSubmiting && this.check()) {
                    price.value = Number(price.value);
                    isSubmiting = true;
                    form.submit();
                }
            }.bind(this), false);
            [title,abstracts, icon, text, price].forEach(function (item) {
                item.addEventListener('input', function (e) {
                    item.classList.remove('z-err');
                }.bind(this), false);
            }.bind(this));
            icon.addEventListener('input', function (e) {
                var value = icon.value.trim();
                if (value != '' && /^(http|https):\/\//.test(value) && /\.(jpg|gif|png)$/.test(value)) {
                    imgpre.src = value;
                }
            }.bind(this), false);
        },
        check: function () {
            var result = true;
            [
                [title, function (value) {
                    return value.length < 2 || value.length > 80
                }],
                [abstracts, function (value) {
                    return value.length < 2 || value.length > 140
                }],
                [icon, function (value) {
                    return value == '' || !(/^(http|https):\/\//.test(value) && /\.(jpg|gif|png)$/.test(value))
                }],
                [text, function (value) {
                    return value.length < 2 || value.length > 1000
                }],
                [price, function (value) {
                    return value == '' || !Number(value)
                }]
            ].forEach(function (item) {
                var value = item[0].value.trim();
                if (item[1](value)) {
                    item[0].classList.add('z-err');
                    result = false;
                }
                item[0].value = value;
            });
            return result;
        }
    };
    page.init();
})(window, document);