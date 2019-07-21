(ns net.minecraft.entity.monster.EntityZombieVillager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityZombieVillager]))

(defn ->entity-zombie-villager
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityZombieVillager [^net.minecraft.world.World world-in]
    (new EntityZombieVillager world-in)))

(defn *register-fixes-zombie-villager
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityZombieVillager/registerFixesZombieVillager fixer)))

(defn get-forge-profession
  "returns: `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`"
  (^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession [^EntityZombieVillager this]
    (-> this (.getForgeProfession))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityZombieVillager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn on-update
  ""
  ([^EntityZombieVillager this]
    (-> this (.onUpdate))))

(defn get-ambient-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^EntityZombieVillager this]
    (-> this (.getAmbientSound))))

(defn get-death-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^EntityZombieVillager this]
    (-> this (.getDeathSound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityZombieVillager this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn set-forge-profession
  "prof - `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`"
  ([^EntityZombieVillager this ^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession prof]
    (-> this (.setForgeProfession prof))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityZombieVillager this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-hurt-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^EntityZombieVillager this]
    (-> this (.getHurtSound))))

(defn get-step-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^EntityZombieVillager this]
    (-> this (.getStepSound))))

(defn get-profession
  "returns: `int`"
  (^Integer [^EntityZombieVillager this]
    (-> this (.getProfession))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityZombieVillager this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn set-profession
  "profession - `int`"
  ([^EntityZombieVillager this ^Integer profession]
    (-> this (.setProfession profession))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityZombieVillager this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn converting?
  "returns: `boolean`"
  (^Boolean [^EntityZombieVillager this]
    (-> this (.isConverting))))

