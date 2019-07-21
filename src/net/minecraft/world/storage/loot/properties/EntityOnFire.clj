(ns net.minecraft.world.storage.loot.properties.EntityOnFire
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.properties EntityOnFire]))

(defn ->entity-on-fire
  "Constructor.

  on-fire-in - `boolean`"
  (^EntityOnFire [^Boolean on-fire-in]
    (new EntityOnFire on-fire-in)))

(defn test-property
  "random - `java.util.Random`
  entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityOnFire this ^java.util.Random random ^net.minecraft.entity.Entity entity-in]
    (-> this (.testProperty random entity-in))))

