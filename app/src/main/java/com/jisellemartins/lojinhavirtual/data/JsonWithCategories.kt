package com.jisellemartins.lojinhavirtual.data

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jisellemartins.lojinhavirtual.model.CategoryModel

fun JsonWithCategories():List<CategoryModel> {
    val json: String = "[\n" +
            " {\n" +
            "  \"categoria\": \"Camas\",\n" +
            "  \"produtos\": [\n" +
            "   {\n" +
            "    \"category\": \"camas\",\n" +
            "    \"title\": \"Cama Londres Azul - Chicxs\",\n" +
            "    \"description\": \"- Cuidados com a Cama para Cachorro Londres Bichinho Chic Azul. - Mantenha a caminha do seu pet sempre limpa e higienizada. - Escolha o tamanho da caminha de acordo com o porte do seu cachorro ou gato.\",\n" +
            "    \"price\": 295,\n" +
            "    \"discount\": true,\n" +
            "    \"percentDiscount\": 10,\n" +
            "    \"imageURL\": \"https://a-static.mlcdn.com.br/450x450/caminha-pra-shitzu-cama-pra-cachorro-medio-porte-60cm-x-60cm-cinza-enxovaisbaratao/enxovaisbaratao1/15861820345/31ad6be0933ae81428f6cd4b2f88f2ba.jpeg\",\n" +
            "    \"id\": \"1\"\n" +
            "   },\n" +
            "   {\n" +
            "    \"category\": \"camas\",\n" +
            "    \"title\": \"Cama Luppet Quadrada Azul\",\n" +
            "    \"description\": \"- Feita com o tecido de microfibra semi-impermeável; - Design lindo; - Almofada fixa com a cama, sem a possibilidade do Pet morde-la ou tira-la do lugar; - Uma cor linda para seu ambiente; - Evita mofos, não junta ácaros e/ou fungos;\",\n" +
            "    \"price\": 130,\n" +
            "    \"discount\": false,\n" +
            "    \"percentDiscount\": 0,\n" +
            "    \"imageURL\": \"https://static1.efacil.com.br/wcsstore/ExtendedSitesCatalogAssetStore/Imagens/360/2665-00026_01.jpg\",\n" +
            "    \"id\": \"2\"\n" +
            "   },\n" +
            "   {\n" +
            "    \"category\": \"camas\",\n" +
            "    \"title\": \"Cama Luppet Quadrada Vermelha\",\n" +
            "    \"description\": \"- Feita com o tecido de microfibra semi-impermeável; - Design lindo; - Almofada fixa com a cama, sem a possibilidade do Pet morde-la ou tira-la do lugar; - Uma cor linda para seu ambiente; - Evita mofos, não junta ácaros e/ou fungos;\",\n" +
            "    \"price\": 130,\n" +
            "    \"discount\": false,\n" +
            "    \"percentDiscount\": 0,\n" +
            "    \"imageURL\": \"https://images-americanas.b2w.io/produtos/3923126461/imagens/caminha-pet-2-pecas-para-cachorro-e-gato-dupla-face-60x60-ossinho-vermelho/3923126461_1_large.jpg\",\n" +
            "    \"id\": \"3\"\n" +
            "   }\n" +
            "  ],\n" +
            "  \"icon\":\"R.drawable.caminhas\",\n" +
            "  \"id\": \"1\"\n" +
            " },\n" +
            " {\n" +
            "  \"categoria\": \"Brinquedos\",\n" +
            "  \"produtos\": [\n" +
            "    {\n" +
            "        \"category\": \"brinquedos\",\n" +
            "        \"title\": \"Mordedor vermelho\",\n" +
            "        \"description\": \"Mordedor para pet\",\n" +
            "        \"price\": 50,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://cobasi.vteximg.com.br/arquivos/ids/665754-400-400/Vermelho.jpg?v=637575669734670000\",\n" +
            "        \"id\": \"4\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"category\": \"brinquedos\",\n" +
            "        \"title\": \"Macaco de pelúcia\",\n" +
            "        \"description\": \"Macaco de pelúcia para pet\",\n" +
            "        \"price\": 62,\n" +
            "        \"discount\": true,\n" +
            "        \"percentDiscount\": 20,\n" +
            "        \"imageURL\": \"https://petcaesecia.fbitsstatic.net/img/p/brinquedo-pelucia-macaco-com-apito-84144/268477.jpg?w=525&h=525&v=no-change&qs=ignore\",\n" +
            "        \"id\": \"5\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"category\": \"brinquedos\",\n" +
            "        \"title\": \"Mordedor vermelho\",\n" +
            "        \"description\": \"Mordedor para pet\",\n" +
            "        \"price\": 50,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://cobasi.vteximg.com.br/arquivos/ids/665754-400-400/Vermelho.jpg?v=637575669734670000\",\n" +
            "        \"id\": \"6\"\n" +
            "      }\n" +
            "  ],\n" +
            "  \"icon\":\"R.drawable.brinquedos\",\n" +
            "  \"id\": \"2\"\n" +
            " },\n" +
            " {\n" +
            "  \"categoria\": \"Comedouros\",\n" +
            "  \"produtos\": [\n" +
            "    {\n" +
            "        \"category\": \"comedouros\",\n" +
            "        \"title\": \"Comedouro vermelho\",\n" +
            "        \"description\": \"Comedouro vermelho para pet\",\n" +
            "        \"price\": 32,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://images.tcdn.com.br/img/img_prod/765626/comedouro_alum_pesado_medio_1650ml_vermelho_12403_1_20200407160007.jpg\",\n" +
            "        \"id\": \"7\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"category\": \"comedouros\",\n" +
            "        \"title\": \"Comedouro vermelho\",\n" +
            "        \"description\": \"Comedouro vermelho para pet\",\n" +
            "        \"price\": 32,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://images.tcdn.com.br/img/img_prod/765626/comedouro_alum_pesado_medio_1650ml_vermelho_12403_1_20200407160007.jpg\",\n" +
            "        \"id\": \"8\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"category\": \"comedouros\",\n" +
            "        \"title\": \"Comedouro vermelho\",\n" +
            "        \"description\": \"Comedouro vermelho para pet\",\n" +
            "        \"price\": 32,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://images.tcdn.com.br/img/img_prod/765626/comedouro_alum_pesado_medio_1650ml_vermelho_12403_1_20200407160007.jpg\",\n" +
            "        \"id\": \"9\"\n" +
            "      }\n" +
            "  ],\n" +
            "  \"icon\":\"R.drawable.comedouros\",\n" +
            "  \"id\": \"3\"\n" +
            " },\n" +
            " {\n" +
            "  \"categoria\": \"Casinhas\",\n" +
            "  \"produtos\": [\n" +
            "    {\n" +
            "        \"category\": \"casinhas\",\n" +
            "        \"title\": \"Casinha duplex\",\n" +
            "        \"description\": \"Casinha duplex com escada para seu pet\",\n" +
            "        \"price\": 320,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://www.lojadoghouse.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/a/casinha_de_cachorro_de_madeira_deck_dog_house.jpg\",\n" +
            "        \"id\": \"10\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"category\": \"casinhas\",\n" +
            "        \"title\": \"Casinha duplex\",\n" +
            "        \"description\": \"Casinha duplex com escada para seu pet\",\n" +
            "        \"price\": 320,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://www.lojadoghouse.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/a/casinha_de_cachorro_de_madeira_deck_dog_house.jpg\",\n" +
            "        \"id\": \"11\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"category\": \"casinhas\",\n" +
            "        \"title\": \"Casinha duplex\",\n" +
            "        \"description\": \"Casinha duplex com escada para seu pet\",\n" +
            "        \"price\": 320,\n" +
            "        \"discount\": false,\n" +
            "        \"percentDiscount\": 0,\n" +
            "        \"imageURL\": \"https://www.lojadoghouse.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/a/casinha_de_cachorro_de_madeira_deck_dog_house.jpg\",\n" +
            "        \"id\": \"12\"\n" +
            "      }\n" +
            "  ],\n" +
            "  \"icon\":\"R.drawable.casinhas\",\n" +
            "  \"id\": \"4\"\n" +
            " }\n" +
            "]"


    val gson: Gson = Gson()
    //val json2 = getJson()

    val myType = object : TypeToken<List<CategoryModel>>() {}.type
    val logs = gson.fromJson<List<CategoryModel>>(json, myType)
    return logs
}