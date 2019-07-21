(ns net.minecraft.world.storage.loot.conditions.EntityHasProperty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions EntityHasProperty]))

(defn ->entity-has-property
  "Constructor.

  properties-in - `net.minecraft.world.storage.loot.properties.EntityProperty[]`
  target-in - `net.minecraft.world.storage.loot.LootContext$EntityTarget`"
  (^EntityHasProperty [properties-in ^net.minecraft.world.storage.loot.LootContext$EntityTarget target-in]
    (new EntityHasProperty properties-in target-in)))

(defn test-condition
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^EntityHasProperty this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.testCondition rand context))))

