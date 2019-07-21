(ns net.minecraft.world.storage.loot.LootEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootEntry]))

(defn get-effective-weight
  "luck - `float`

  returns: `int`"
  (^Integer [^LootEntry this ^Float luck]
    (-> this (.getEffectiveWeight luck))))

(defn get-entry-name
  "returns: `java.lang.String`"
  (^java.lang.String [^LootEntry this]
    (-> this (.getEntryName))))

(defn add-loot
  "stacks - `java.util.Collection`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`"
  ([^LootEntry this ^java.util.Collection stacks ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.addLoot stacks rand context))))

