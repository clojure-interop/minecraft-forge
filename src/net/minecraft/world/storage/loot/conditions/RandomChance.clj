(ns net.minecraft.world.storage.loot.conditions.RandomChance
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions RandomChance]))

(defn ->random-chance
  "Constructor.

  chance-in - `float`"
  (^RandomChance [^Float chance-in]
    (new RandomChance chance-in)))

(defn test-condition
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^RandomChance this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.testCondition rand context))))

