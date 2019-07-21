(ns net.minecraftforge.common.DungeonHooks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common DungeonHooks]))

(defn ->dungeon-hooks
  "Constructor."
  (^DungeonHooks []
    (new DungeonHooks )))

(defn *add-dungeon-mob
  "Adds a mob to the possible list of creatures the spawner will create.
   If the mob is already in the spawn list, the rarity will be added to the existing one,
   causing the mob to be more common.

  name - The name of the monster, use the same name used when registering the entity. - `net.minecraft.util.ResourceLocation`
  rarity - The rarity of selecting this mob over others. Must be greater then 0. Vanilla Minecraft has the following mobs: Spider 100 Skeleton 100 Zombie 200 Meaning, Zombies are twice as common as spiders or skeletons. - `int`

  returns: The new rarity of the monster, - `float`"
  (^Float [^net.minecraft.util.ResourceLocation name ^Integer rarity]
    (DungeonHooks/addDungeonMob name rarity)))

(defn *remove-dungeon-mob
  "Will completely remove a Mob from the dungeon spawn list.

  name - The name of the mob to remove - `net.minecraft.util.ResourceLocation`

  returns: The rarity of the removed mob, prior to being removed. - `int`"
  (^Integer [^net.minecraft.util.ResourceLocation name]
    (DungeonHooks/removeDungeonMob name)))

(defn *get-random-dungeon-mob
  "Gets a random mob name from the list.

  rand - World generation random number generator - `java.util.Random`

  returns: The mob name - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^java.util.Random rand]
    (DungeonHooks/getRandomDungeonMob rand)))

