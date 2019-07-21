(ns net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry VillagerRegistry$VillagerProfession]))

(defn ->villager-profession
  "Constructor.

  name - `java.lang.String`
  texture - `java.lang.String`
  zombie - `java.lang.String`"
  (^VillagerRegistry$VillagerProfession [^java.lang.String name ^java.lang.String texture ^java.lang.String zombie]
    (new VillagerRegistry$VillagerProfession name texture zombie))
  (^VillagerRegistry$VillagerProfession [^java.lang.String name ^java.lang.String texture]
    (new VillagerRegistry$VillagerProfession name texture)))

(defn get-skin
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^VillagerRegistry$VillagerProfession this]
    (-> this (.getSkin))))

(defn get-zombie-skin
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^VillagerRegistry$VillagerProfession this]
    (-> this (.getZombieSkin))))

(defn get-career
  "id - `int`

  returns: `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerCareer`"
  (^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerCareer [^VillagerRegistry$VillagerProfession this ^Integer id]
    (-> this (.getCareer id))))

(defn get-random-career
  "rand - `java.util.Random`

  returns: `int`"
  (^Integer [^VillagerRegistry$VillagerProfession this ^java.util.Random rand]
    (-> this (.getRandomCareer rand))))

