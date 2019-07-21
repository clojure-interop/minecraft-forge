(ns net.minecraftforge.common.DungeonHooks$DungeonMob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common DungeonHooks$DungeonMob]))

(defn ->dungeon-mob
  "Constructor.

  weight - `int`
  type - `net.minecraft.util.ResourceLocation`"
  (^DungeonHooks$DungeonMob [^Integer weight ^net.minecraft.util.ResourceLocation type]
    (new DungeonHooks$DungeonMob weight type)))

(defn type
  "Instance Field.

  type: net.minecraft.util.ResourceLocation"
  (^net.minecraft.util.ResourceLocation [^DungeonHooks$DungeonMob this]
    (-> this .-type)))

(defn equals
  "target - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DungeonHooks$DungeonMob this ^java.lang.Object target]
    (-> this (.equals target))))

