(ns net.minecraft.world.storage.loot.conditions.KilledByPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions KilledByPlayer]))

(defn ->killed-by-player
  "Constructor.

  inverse-in - `boolean`"
  (^KilledByPlayer [^Boolean inverse-in]
    (new KilledByPlayer inverse-in)))

(defn test-condition
  "rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^KilledByPlayer this ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.testCondition rand context))))

