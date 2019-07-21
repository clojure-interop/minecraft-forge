(ns net.minecraft.entity.boss.EntityDragon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss EntityDragon]))

(defn ->entity-dragon
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityDragon [^net.minecraft.world.World world-in]
    (new EntityDragon world-in)))

(def *-phase
  "Static Constant.

  type: net.minecraft.network.datasync.DataParameter<java.lang.Integer>"
  EntityDragon/PHASE)

(defn ring-buffer
  "Instance Field.

  type: double[][]"
  ([^EntityDragon this]
    (-> this .-ringBuffer)))

(defn ring-buffer-index
  "Instance Field.

  type: int"
  (^Integer [^EntityDragon this]
    (-> this .-ringBufferIndex)))

(defn dragon-part-array
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart[]"
  ([^EntityDragon this]
    (-> this .-dragonPartArray)))

(defn dragon-part-head
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartHead)))

(defn dragon-part-neck
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartNeck)))

(defn dragon-part-body
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartBody)))

(defn dragon-part-tail-1
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartTail1)))

(defn dragon-part-tail-2
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartTail2)))

(defn dragon-part-tail-3
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartTail3)))

(defn dragon-part-wing-1
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartWing1)))

(defn dragon-part-wing-2
  "Instance Field.

  type: net.minecraft.entity.boss.EntityDragonPart"
  (^net.minecraft.entity.boss.EntityDragonPart [^EntityDragon this]
    (-> this .-dragonPartWing2)))

(defn prev-anim-time
  "Instance Field.

  type: float"
  (^Float [^EntityDragon this]
    (-> this .-prevAnimTime)))

(defn anim-time
  "Instance Field.

  type: float"
  (^Float [^EntityDragon this]
    (-> this .-animTime)))

(defn slowed
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityDragon this]
    (-> this .-slowed)))

(defn death-ticks
  "Instance Field.

  type: int"
  (^Integer [^EntityDragon this]
    (-> this .-deathTicks)))

(defn healing-ender-crystal
  "Instance Field.

  type: net.minecraft.entity.item.EntityEnderCrystal"
  (^net.minecraft.entity.item.EntityEnderCrystal [^EntityDragon this]
    (-> this .-healingEnderCrystal)))

(defn *register-fixes-dragon
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityDragon/registerFixesDragon fixer)))

(defn non-boss?
  "returns: `boolean`"
  (^Boolean [^EntityDragon this]
    (-> this (.isNonBoss))))

(defn attack-entity-from-part
  "dragon-part - `net.minecraft.entity.boss.EntityDragonPart`
  source - `net.minecraft.util.DamageSource`
  damage - `float`

  returns: `boolean`"
  (^Boolean [^EntityDragon this ^net.minecraft.entity.boss.EntityDragonPart dragon-part ^net.minecraft.util.DamageSource source ^Float damage]
    (-> this (.attackEntityFromPart dragon-part source damage))))

(defn on-kill-command
  ""
  ([^EntityDragon this]
    (-> this (.onKillCommand))))

(defn add-potion-effect
  "potioneffect-in - `net.minecraft.potion.PotionEffect`"
  ([^EntityDragon this ^net.minecraft.potion.PotionEffect potioneffect-in]
    (-> this (.addPotionEffect potioneffect-in))))

(defn init-path-points
  "returns: `int`"
  (^Integer [^EntityDragon this]
    (-> this (.initPathPoints))))

(defn get-head-part-y-offset
  "p-184667-1 - `int`
  p-184667-2 - `double[]`
  p-184667-3 - `double[]`

  returns: `float`"
  (^Float [^EntityDragon this ^Integer p-184667-1 p-184667-2 p-184667-3]
    (-> this (.getHeadPartYOffset p-184667-1 p-184667-2 p-184667-3))))

(defn get-head-look-vec
  "p-184665-1 - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityDragon this ^Float p-184665-1]
    (-> this (.getHeadLookVec p-184665-1))))

(defn get-nearest-pp-idx
  "x - `double`
  y - `double`
  z - `double`

  returns: `int`"
  (^Integer [^EntityDragon this ^Double x ^Double y ^Double z]
    (-> this (.getNearestPpIdx x y z))))

(defn get-parts
  "returns: `net.minecraft.entity.Entity[]`"
  ([^EntityDragon this]
    (-> this (.getParts))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityDragon this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-crystal-destroyed
  "crystal - `net.minecraft.entity.item.EntityEnderCrystal`
  pos - `net.minecraft.util.math.BlockPos`
  dmg-src - `net.minecraft.util.DamageSource`"
  ([^EntityDragon this ^net.minecraft.entity.item.EntityEnderCrystal crystal ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.DamageSource dmg-src]
    (-> this (.onCrystalDestroyed crystal pos dmg-src))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EntityDragon this]
    (-> this (.getWorld))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityDragon this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-phase-manager
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseManager`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseManager [^EntityDragon this]
    (-> this (.getPhaseManager))))

(defn get-fight-manager
  "returns: `net.minecraft.world.end.DragonFightManager`"
  (^net.minecraft.world.end.DragonFightManager [^EntityDragon this]
    (-> this (.getFightManager))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityDragon this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityDragon this]
    (-> this (.getSoundCategory))))

(defn find-path
  "start-idx - `int`
  finish-idx - `int`
  and-then - `net.minecraft.pathfinding.PathPoint`

  returns: `net.minecraft.pathfinding.Path`"
  (^net.minecraft.pathfinding.Path [^EntityDragon this ^Integer start-idx ^Integer finish-idx ^net.minecraft.pathfinding.PathPoint and-then]
    (-> this (.findPath start-idx finish-idx and-then))))

(defn get-movement-offsets
  "p-70974-1 - `int`
  p-70974-2 - `float`

  returns: `double[]`"
  ([^EntityDragon this ^Integer p-70974-1 ^Float p-70974-2]
    (-> this (.getMovementOffsets p-70974-1 p-70974-2))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityDragon this]
    (-> this (.canBeCollidedWith))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityDragon this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn on-living-update
  ""
  ([^EntityDragon this]
    (-> this (.onLivingUpdate))))

