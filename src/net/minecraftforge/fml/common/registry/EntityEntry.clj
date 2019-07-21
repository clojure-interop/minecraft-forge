(ns net.minecraftforge.fml.common.registry.EntityEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry EntityEntry]))

(defn ->entity-entry
  "Constructor.

  cls - `java.lang.Class`
  name - `java.lang.String`"
  (^EntityEntry [^java.lang.Class cls ^java.lang.String name]
    (new EntityEntry cls name)))

(defn get-entity-class
  "returns: `java.lang.Class<? extends net.minecraft.entity.Entity>`"
  ([^EntityEntry this]
    (-> this (.getEntityClass))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityEntry this]
    (-> this (.getName))))

(defn get-egg
  "returns: `net.minecraft.entity.EntityList$EntityEggInfo`"
  (^net.minecraft.entity.EntityList$EntityEggInfo [^EntityEntry this]
    (-> this (.getEgg))))

(defn set-egg
  "egg - `net.minecraft.entity.EntityList$EntityEggInfo`"
  ([^EntityEntry this ^net.minecraft.entity.EntityList$EntityEggInfo egg]
    (-> this (.setEgg egg))))

(defn new-instance
  "world - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityEntry this ^net.minecraft.world.World world]
    (-> this (.newInstance world))))

