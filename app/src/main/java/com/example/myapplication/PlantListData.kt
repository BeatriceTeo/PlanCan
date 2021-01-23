package com.example.myapplication

import com.example.data.PlantCharacteristics

class PlantListData {
    fun allPlants(): List<PlantCharacteristics> {
        val ListOfPlants = listOf(
                PlantCharacteristics("1","Absinthe","Mars, April","Three times deeper than the size of the seed",80,80,"The next year after plantation","During summer, cut the flower stems before the seed is mature.",""),
                PlantCharacteristics("2","Garlic","October, November, February, March","Three times deeper than the size of the seed",10,30,"June, July","In June, take them out.","Beetroot, cucumber, strawberry, lettuce, tomato"),
                PlantCharacteristics("3","Dill","April, May","Three times deeper than the size of the seed",25,30,"60 days for the leaves, 150 days for the seeds","Weed them regularly at the beginning.",""),
                PlantCharacteristics("4","Anise","April, May","Three times deeper than the size of the seed",15,40,"60 days for the leaves, 150 days for the seeds","Weed them at the beginning.",""),
                PlantCharacteristics("5","Orach","Mars, April, May, June, July","Three times deeper than the size of the seed",40,40,"45 days for the first leaves","Pick them when they reach around 30cm.",""),
                PlantCharacteristics("6","Artichoke","February, Mars","Three times deeper than the size of the seed",80,80,"August, September","Earth them up and then unearth them.","Beans, lettuce, onion, pees, radish"),
                PlantCharacteristics("7","Cardon","May","Three times deeper than the size of the seed",100,100,"October","Wash them 3 weeks before harvest",""),
                PlantCharacteristics("8","Eggplant","February","Three times deeper than the size of the seed",40,50,"July","In July, cut above the second flower.","Beans"),
                PlantCharacteristics("9","Burdock","July","Three times deeper than the size of the seed",20,30,"October, November","Cut the eventual flower stems.",""),
                PlantCharacteristics("10","Basil","Mars, April, May, June, July","Three times deeper than the size of the seed",25,25,"60 days","Pinch the plants to make them branched",""),
                PlantCharacteristics("11","Beetroot","Mars, April, May, June","Three times deeper than the size of the seed",15,30,"June, July, August, September, October, November","Clear them at 5cm when they are 10cm.","Garlic, cabbage, cucumber, beans, turnip, onion, pees"),
                PlantCharacteristics("12","Tuberous Nasturtium","April, May","Three times deeper than the size of the seed",80,80,"7 months after plantation","Earth up when they are 12cm high.",""),
                PlantCharacteristics("13","Carrot","February, March, April","Three times deeper than the size of the seed",5,30,"May, June, July","Clear them carefully after they begin to grow.","Beans, lettuce, turnip, onion, leek, pees, radish, tomato"),
                PlantCharacteristics("14","Carrot for conservation","May, June, July","Three times deeper than the size of the seed",5,30,"August, September, October","Clear them carefully after they begin to grow.","Beans, lettuce, turnip, onion, leek, pees, radish, tomato"),
                PlantCharacteristics("15","Blackcurrant","September, October, November, Mars","Three times deeper than the size of the seed",100,100,"July","At the end of the winter, cut them.",""),
                PlantCharacteristics("16","Celery","February, March, April","Three times deeper than the size of the seed",40,40,"7 months for the celery root and 5, 6 months for the leaves","???","Cabbage, leek, radish, tomato"),
                PlantCharacteristics("17","Chervil","February, March, April,May, June, July, August, September","Three times deeper than the size of the seed",10,25,"45 days after plantation","Leave only a few flowers and cut the rest.",""),
                PlantCharacteristics("18","Chervil root","October","Three times deeper than the size of the seed",4,30,"240-300 days after plantation","Let it dry 3 months before eating.",""),
                PlantCharacteristics("19","Goosefoot","April, May, June","Three times deeper than the size of the seed",50,50,"40-80 days after plantation","Cut the flowers.",""),
                PlantCharacteristics("20","Chicory","June, July","Three times deeper than the size of the seed",30,30,"September, October","Clean them before harvesting.",""),
                PlantCharacteristics("21","Dandelion","Mars, April, June","Three times deeper than the size of the seed",10,30,"September, October, November","Clean them at the beginning of winter.",""),
                PlantCharacteristics("22","Cabbage","August, September, February","Three times deeper than the size of the seed",50,50,"Spring, beginning of summer","Plant them in October and Mars.","Beetroot, celery, spinach, beans, lettuce, pees, potato, tomato"),
                PlantCharacteristics("23","Savoy","April, May, June","Three times deeper than the size of the seed",60,60,"Autumn, beginning of winter","Plant them in May or June",""),
                PlantCharacteristics("24","Brussels sprout","February, Mars, April","Three times deeper than the size of the seed",70,70,"Winter, spring","Plant them in April or June",""),
                PlantCharacteristics("25","Green cabbage","May, June","Three times deeper than the size of the seed",60,60,"Winter, spring","Plant them in June or July",""),
                PlantCharacteristics("26","Broccoli","April, May","Three times deeper than the size of the seed",70,70,"Winter, spring","Plant them in June or July",""),
                PlantCharacteristics("27","Cauliflower","Mars, April, May","Three times deeper than the size of the seed",50,70,"Summer, Autumn","Plant them in April, May or June",""),
                PlantCharacteristics("28","Chinese cabbage","July, August","Three times deeper than the size of the seed",30,40,"September, October","???",""),
                PlantCharacteristics("29","Chives","Mars, April","Three times deeper than the size of the seed",20,20,"July, August","",""),
                PlantCharacteristics("30","Cucumber","April","Three times deeper than the size of the seed",150,100,"June, July","///","Garlic, beetroot, cabbage, beans, corn, onion, pees, radish"),
                PlantCharacteristics("31","Tomatillo","Mars, April","Three times deeper than the size of the seed",80,100,"August, September, October","///",""),
                PlantCharacteristics("32","Coriander","April, May, June, July, August, September","Three times deeper than the size of the seed",20,30,"40 days after plantation for the leaves and 120 days for the seeds","Seed regularly to have fresh seeds.",""),
                PlantCharacteristics("33","Squash","April","Three times deeper than the size of the seed",100,100,"60 days after plantation for the not matured and 150 days for the seeds","Protect the fruit from the humidity of the earth.","Beans, lettuce, corn, turnip"),
                PlantCharacteristics("34","Zucchini","April","Three times deeper than the size of the seed",80,80,"June, July","Protect the fruit from the humidity of the earth.","Beans, lettuce, corn, turnip"),
                PlantCharacteristics("35","Shallot","October, November, February, Mars, April","Three times deeper than the size of the seed",20,30,"150-300 days after plantation","///",""),
                PlantCharacteristics("36","Spinach","February, March, April, August, September","Three times deeper than the size of the seed",10,30,"60 days after plantation","///","Strawberry, beans, onion, leek, pees, radish"),
                PlantCharacteristics("37","Fennel","April, May, June, July","Three times deeper than the size of the seed",25,40,"90 days after plantation","Earth up when the bulb starts growing.","Cabbage, strawberry"),
                PlantCharacteristics("38","Bean","October, November, February, March, April","Three times deeper than the size of the seed",20,50,"150 days after plantation","Earth it up and then cut above the fifth flower.","Potato"),
                PlantCharacteristics("39","Amaranth","April, May","Three times deeper than the size of the seed",40,50,"July, August, September","Pinch the flowers before the maturity of the seed.",""),
                PlantCharacteristics("40","Borage","Mars, April, June","Three times deeper than the size of the seed",25,25,"50 days after plantation","",""),
                PlantCharacteristics("41","Nasturium","April, May, June, July","Three times deeper than the size of the seed",30,30,"60 days after plantation","Soak the seeds 24h before planting them.",""),
                PlantCharacteristics("42","Lemon balm Mold","April, May","Three times deeper than the size of the seed",40,50,"July, August","",""),
                PlantCharacteristics("43","Sunflower","April, May","Three times deeper than the size of the seed",50,50,"120 days after plantation","///",""),
                PlantCharacteristics("44","Strawberry","July, August, September, October","Three times deeper than the size of the seed",40,40,"180-240 days after plantation","Cut regularly the stolons.","Garlic, spinach, onion"),
                PlantCharacteristics("45","Raspberry","November, March, April","Three times deeper than the size of the seed",60,150,"June, July, August, September, October","///",""),
                PlantCharacteristics("46","Currant","October, November, December, January, February, Mars","Three times deeper than the size of the seed",120,120,"July, August, September,October","Cut it at the beginning of winter.",""),
                PlantCharacteristics("47","Lettuce","February, Mars, April, May, June, July, August, September","Three times deeper than the size of the seed",25,25,"From April to November","Keep the earth fresh during growing.","Garlic, artichoke, carrot, cabbage, zucchini, squash, corn, turnip, onion, leek, radish"),
                PlantCharacteristics("48","Lavender","April, May, June","Three times deeper than the size of the seed",60,60,"One year after plantation","Cut a big part of them after flowering.",""),
                PlantCharacteristics("49","Lovage","August","Three times deeper than the size of the seed",60,60,"240 days after plantation","Cut the flower stems.",""),
                PlantCharacteristics("50","Salad","July, August, September","Three times deeper than the size of the seed",100,15,"60 days after plantation","Pull out the weeds regularly in the beginning of the culture.","Leek, tomato"),
                PlantCharacteristics("51","Corn","May, June","Three times deeper than the size of the seed",40,70,"90-150 days after plantation","Earth it up.","Cucumber, squash, zucchini, lettuce, tomato"),
                PlantCharacteristics("52","Marjoram","March, April, May","Three times deeper than the size of the seed",15,30,"90 days after plantation","///",""),
                PlantCharacteristics("53","Lemon balm","May","Three times deeper than the size of the seed",60,60,"150 days after plantation","It can be an invasive plant.",""),
                PlantCharacteristics("54","Melon","April","Three times deeper than the size of the seed",75,120,"150 days after plantation","Leave the roots open in June.",""),
                PlantCharacteristics("55","Mint","March, April, May, June","Three times deeper than the size of the seed",100,100,"One year after plantation","Contain it.",""),
                PlantCharacteristics("56","Claytone of Cuba","April, May, June, July","Three times deeper than the size of the seed",10,20,"60 days after plantation","Maintain wet in case of drought.",""),
                PlantCharacteristics("57","Watercress","March, April, August, September","Three times deeper than the size of the seed",100,25,"30 days after plantation","Maintain wet in case of drought.",""),
                PlantCharacteristics("58","Mustard of China","March, April, July, August","Three times deeper than the size of the seed",35,35,"90 days after plantation","Maintain the soil wet.",""),
                PlantCharacteristics("59","Turnip","March, April, May, June, July, August","Three times deeper than the size of the seed",10,30,"70 days after plantation","Clear the plants when they start to grow.","Beetroot, carrot, squash, zucchini, lettuce, pees"),
                PlantCharacteristics("60","Rutabaga","April, May","Three times deeper than the size of the seed",35,35,"120-150 days after plantation","Protect of flea beetles in the summer.",""),
                PlantCharacteristics("61","Onion","September, October","Three times deeper than the size of the seed",15,35,"180 days after plantation","","Artichoke, beetroot, carrot, cucumber, spinach, strawberry, lettuce, leek, tomato"),
                PlantCharacteristics("62","Origan","March, April, September, October","Three times deeper than the size of the seed",30,30,"180 days after plantation","///",""),
                PlantCharacteristics("63","Sorrel","March, April, May, June","Three times deeper than the size of the seed",30,30,"120 days after plantation","Cut the flower stems.",""),
                PlantCharacteristics("64","Parsnip","March, April, May, June","Three times deeper than the size of the seed",10,30,"150 days after plantation","Clear when the plants start growing.",""),
                PlantCharacteristics("65","Watermelon","April","Three times deeper than the size of the seed",150,150,"120-150 days after plantation","Uncover the roots at the beginning of July.",""),
                PlantCharacteristics("66","Parsley","March, April, May, June, July, August","Three times deeper than the size of the seed",3,30,"100 days after plantation","Leave some plants for seeds.","Tomato"),
                PlantCharacteristics("67","Parsley root","Mars, April","Three times deeper than the size of the seed",15,30,"240 days after plantation","Clear carefully.",""),
                PlantCharacteristics("68","Leek","February, March","Three times deeper than the size of the seed",10,35,"180 days after plantation","Earth up the plant when it has 20cm and again one month after.","Carrot, celery, spinach, lettuce, salad, onion, tomato"),
                PlantCharacteristics("68","Peas","October, November, February, March, April","Three times deeper than the size of the seed",4,50,"60-90 days after plantation","Earth up when the plant is 15cm and after put a structure.","Artichoke, beetroot, carrot, cabbage, cucumber, spinach, turnip, potato, radish"),
                PlantCharacteristics("69","Pepper","February, March","Three times deeper than the size of the seed",50,50,"150 days after plantation","Usually in automn, leave only two flowers above the last fruit that was formed.",""),
                PlantCharacteristics("70","Potato","March","Three times deeper than the size of the seed",40,75,"70-150 days after plantation","Earth it up once or twice during growing.","Cabbage, pees, beans, pees, radish, horseradish"),
                PlantCharacteristics("71","Radish","March, April, May, June, July, August, September","Three times deeper than the size of the seed",2,20,"One month after seeding","Pull out de weeds regularly when they start growing.","Artichoke, carrot, celery, cucumber, spinach, lettuce, tomato, pees, potato"),
                PlantCharacteristics("72","Winter radish","July, August","Three times deeper than the size of the seed",10,25,"70 days after plantation","Protect it from flea beetles.",""),
                PlantCharacteristics("73","Horseradish","March, April, September, October","Three times deeper than the size of the seed",50,50,"18 months after plantation","//","Potato"),
                PlantCharacteristics("74","Rhubarb","March, April","Three times deeper than the size of the seed",100,150,"One year after plantation","Cut the flower stems.",""),
                PlantCharacteristics("75","Rosemary","April, May, June","Three times deeper than the size of the seed",80,80,"Two years after plantation","///",""),
                PlantCharacteristics("76","Rocket","March, April, May","Three times deeper than the size of the seed",3,20,"50 days after plantation","???",""),
                PlantCharacteristics("77","Salsify","March, April, May","Three times deeper than the size of the seed",10,25,"210 days after plantation","Pay attention to clearing.",""),
                PlantCharacteristics("78","Savory","April","Three times deeper than the size of the seed",25,50,"One year after plantation","",""),
                PlantCharacteristics("79","Sage","April, May, June, July, August, September","Three times deeper than the size of the seed",40,80,"One year after plantation","///",""),
                PlantCharacteristics("80","Steavia","March, April","Three times deeper than the size of the seed",40,40,"120 days after plantation","Do not let it make flowers.",""),
                PlantCharacteristics("81","Thyme","April, May","Three times deeper than the size of the seed",20,40,"One year after plantation","///",""),
                PlantCharacteristics("82","Tomato","Mars","Three times deeper than the size of the seed",50,70,"Four, five months after plantation","//","Carrot, celery, cabbage, salad, corn, onion, parsley, leek, radish"),
                PlantCharacteristics("83","Jerusalem artichoke","March, April","Three times deeper than the size of the seed",70,70,"200 days after plantation","Earth it up when the plant is 20cm.","")









        )
        return ListOfPlants
    }
}