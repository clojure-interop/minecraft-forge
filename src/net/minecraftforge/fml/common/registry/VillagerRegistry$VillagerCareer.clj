(ns net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerCareer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry VillagerRegistry$VillagerCareer]))

(defn ->villager-career
  "Constructor.

  parent - `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`
  name - `java.lang.String`"
  (^VillagerRegistry$VillagerCareer [^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession parent ^java.lang.String name]
    (new VillagerRegistry$VillagerCareer parent name)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^VillagerRegistry$VillagerCareer this]
    (-> this (.getName))))

(defn add-trade
  "level - `int`
  trades - `net.minecraft.entity.passive.EntityVillager$ITradeList`

  returns: `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerCareer`"
  (^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerCareer [^VillagerRegistry$VillagerCareer this ^Integer level ^net.minecraft.entity.passive.EntityVillager$ITradeList trades]
    (-> this (.addTrade level trades))))

(defn get-trades
  "level - `int`

  returns: `java.util.List<net.minecraft.entity.passive.EntityVillager$ITradeList>`"
  (^java.util.List [^VillagerRegistry$VillagerCareer this ^Integer level]
    (-> this (.getTrades level))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VillagerRegistry$VillagerCareer this ^java.lang.Object o]
    (-> this (.equals o))))

