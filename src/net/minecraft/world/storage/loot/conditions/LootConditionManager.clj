(ns net.minecraft.world.storage.loot.conditions.LootConditionManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions LootConditionManager]))

(defn ->loot-condition-manager
  "Constructor."
  (^LootConditionManager []
    (new LootConditionManager )))

(defn *register-condition
  "condition - `net.minecraft.world.storage.loot.conditions.LootCondition$Serializer`

  returns: `<T extends net.minecraft.world.storage.loot.conditions.LootCondition> void`"
  ([^net.minecraft.world.storage.loot.conditions.LootCondition$Serializer condition]
    (LootConditionManager/registerCondition condition)))

(defn *test-all-conditions
  "conditions - `java.lang.Iterable`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `boolean`"
  (^Boolean [^java.lang.Iterable conditions ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (LootConditionManager/testAllConditions conditions rand context)))

(defn *get-serializer-for-name
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.world.storage.loot.conditions.LootCondition$Serializer<?>`"
  (^net.minecraft.world.storage.loot.conditions.LootCondition$Serializer [^net.minecraft.util.ResourceLocation location]
    (LootConditionManager/getSerializerForName location)))

(defn *get-serializer-for
  "condition-class - `T`

  returns: `<T extends net.minecraft.world.storage.loot.conditions.LootCondition> net.minecraft.world.storage.loot.conditions.LootCondition$Serializer<T>`"
  ([condition-class]
    (LootConditionManager/getSerializerFor condition-class)))

