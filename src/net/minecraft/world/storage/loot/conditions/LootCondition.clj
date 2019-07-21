(ns net.minecraft.world.storage.loot.conditions.LootCondition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions LootCondition]))

(defn test-condition
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^LootCondition this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.testCondition rand context))))

