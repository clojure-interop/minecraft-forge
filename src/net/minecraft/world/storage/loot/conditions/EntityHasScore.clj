(ns net.minecraft.world.storage.loot.conditions.EntityHasScore
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions EntityHasScore]))

(defn ->entity-has-score
  "Constructor.

  score-in - `java.util.Map`
  target-in - `net.minecraft.world.storage.loot.LootContext$EntityTarget`"
  (^EntityHasScore [^java.util.Map score-in ^net.minecraft.world.storage.loot.LootContext$EntityTarget target-in]
    (new EntityHasScore score-in target-in)))

(defn test-condition
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^EntityHasScore this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.testCondition rand context))))

