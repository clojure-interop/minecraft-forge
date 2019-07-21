(ns net.minecraft.world.biome.Biome$SpawnListEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome Biome$SpawnListEntry]))

(defn ->spawn-list-entry
  "Constructor.

  entityclass-in - `java.lang.Class`
  weight - `int`
  group-count-min - `int`
  group-count-max - `int`"
  (^Biome$SpawnListEntry [^java.lang.Class entityclass-in ^Integer weight ^Integer group-count-min ^Integer group-count-max]
    (new Biome$SpawnListEntry entityclass-in weight group-count-min group-count-max)))

(defn entity-class
  "Instance Field.

  type: java.lang.Class<? extends net.minecraft.entity.EntityLiving>"
  ([^Biome$SpawnListEntry this]
    (-> this .-entityClass)))

(defn min-group-count
  "Instance Field.

  type: int"
  (^Integer [^Biome$SpawnListEntry this]
    (-> this .-minGroupCount)))

(defn max-group-count
  "Instance Field.

  type: int"
  (^Integer [^Biome$SpawnListEntry this]
    (-> this .-maxGroupCount)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Biome$SpawnListEntry this]
    (-> this (.toString))))

(defn new-instance
  "world - `net.minecraft.world.World`

  returns: `net.minecraft.entity.EntityLiving`

  throws: java.lang.Exception"
  (^net.minecraft.entity.EntityLiving [^Biome$SpawnListEntry this ^net.minecraft.world.World world]
    (-> this (.newInstance world))))

