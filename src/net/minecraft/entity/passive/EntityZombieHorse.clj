(ns net.minecraft.entity.passive.EntityZombieHorse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityZombieHorse]))

(defn ->entity-zombie-horse
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityZombieHorse [^net.minecraft.world.World world-in]
    (new EntityZombieHorse world-in)))

(defn *register-fixes-zombie-horse
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityZombieHorse/registerFixesZombieHorse fixer)))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityZombieHorse this]
    (-> this (.getCreatureAttribute))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityZombieHorse this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

