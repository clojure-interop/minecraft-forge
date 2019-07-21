(ns net.minecraftforge.event.entity.living.ZombieEvent$SummonAidEvent
  "SummonAidEvent is fired when a Zombie Entity is summoned.
  This event is fired whenever a Zombie Entity is summoned in
  EntityZombie.attackEntityFrom(DamageSource, float).

  This event is fired via the ForgeEventFactory.fireZombieSummonAid(EntityZombie, World, int, int, int, EntityLivingBase, double).

  customSummonedAid remains null, but can be populated with a custom EntityZombie which will be spawned.
  world contains the world that this summoning is occurring in.
  x contains the x-coordinate at which this summoning event is occurring.
  y contains the y-coordinate at which this summoning event is occurring.
  z contains the z-coordinate at which this summoning event is occurring.
  attacker contains the living Entity that attacked and caused this event to fire.
  summonChance contains the likelihood that a Zombie would successfully be summoned.

  This event is not Cancelable.

  This event has a result. HasResult
  Result#ALLOW Zombie is summoned.
  Result#DENY Zombie is not summoned.

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living ZombieEvent$SummonAidEvent]))

(defn ->summon-aid-event
  "Constructor.

  entity - `net.minecraft.entity.monster.EntityZombie`
  world - `net.minecraft.world.World`
  x - `int`
  y - `int`
  z - `int`
  attacker - `net.minecraft.entity.EntityLivingBase`
  summon-chance - `double`"
  (^ZombieEvent$SummonAidEvent [^net.minecraft.entity.monster.EntityZombie entity ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z ^net.minecraft.entity.EntityLivingBase attacker ^Double summon-chance]
    (new ZombieEvent$SummonAidEvent entity world x y z attacker summon-chance)))

(defn get-custom-summoned-aid
  "Populate this field to have a custom zombie instead of a normal zombie summoned

  returns: `net.minecraft.entity.monster.EntityZombie`"
  (^net.minecraft.entity.monster.EntityZombie [^ZombieEvent$SummonAidEvent this]
    (-> this (.getCustomSummonedAid))))

(defn set-custom-summoned-aid
  "custom-summoned-aid - `net.minecraft.entity.monster.EntityZombie`"
  ([^ZombieEvent$SummonAidEvent this ^net.minecraft.entity.monster.EntityZombie custom-summoned-aid]
    (-> this (.setCustomSummonedAid custom-summoned-aid))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ZombieEvent$SummonAidEvent this]
    (-> this (.getWorld))))

(defn get-x
  "returns: `int`"
  (^Integer [^ZombieEvent$SummonAidEvent this]
    (-> this (.getX))))

(defn get-y
  "returns: `int`"
  (^Integer [^ZombieEvent$SummonAidEvent this]
    (-> this (.getY))))

(defn get-z
  "returns: `int`"
  (^Integer [^ZombieEvent$SummonAidEvent this]
    (-> this (.getZ))))

(defn get-attacker
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^ZombieEvent$SummonAidEvent this]
    (-> this (.getAttacker))))

(defn get-summon-chance
  "returns: `double`"
  (^Double [^ZombieEvent$SummonAidEvent this]
    (-> this (.getSummonChance))))

