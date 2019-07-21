(ns net.minecraft.world.storage.loot.conditions.RandomChanceWithLooting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions RandomChanceWithLooting]))

(defn ->random-chance-with-looting
  "Constructor.

  chance-in - `float`
  looting-multiplier-in - `float`"
  (^RandomChanceWithLooting [^Float chance-in ^Float looting-multiplier-in]
    (new RandomChanceWithLooting chance-in looting-multiplier-in)))

(defn test-condition
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^RandomChanceWithLooting this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.testCondition rand context))))

