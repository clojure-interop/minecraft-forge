(ns net.minecraft.world.storage.loot.properties.EntityProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.properties EntityProperty]))

(defn test-property
  "random - `java.util.Random`
  entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityProperty this ^java.util.Random random ^net.minecraft.entity.Entity entity-in]
    (-> this (.testProperty random entity-in))))

