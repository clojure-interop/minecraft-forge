(ns net.minecraft.entity.passive.AbstractHorse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive AbstractHorse]))

(defn ->abstract-horse
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^AbstractHorse [^net.minecraft.world.World world-in]
    (new AbstractHorse world-in)))

(defn tail-counter
  "Instance Field.

  type: int"
  (^Integer [^AbstractHorse this]
    (-> this .-tailCounter)))

(defn sprint-counter
  "Instance Field.

  type: int"
  (^Integer [^AbstractHorse this]
    (-> this .-sprintCounter)))

(defn *register-fixes-abstract-horse
  "fixer - `net.minecraft.util.datafix.DataFixer`
  entity-class - `java.lang.Class`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.Class entity-class]
    (AbstractHorse/registerFixesAbstractHorse fixer entity-class)))

(defn set-jump-power
  "jump-power-in - `int`"
  ([^AbstractHorse this ^Integer jump-power-in]
    (-> this (.setJumpPower jump-power-in))))

(defn can-jump?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.canJump))))

(defn set-tamed-by
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.setTamedBy player))))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^AbstractHorse this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^AbstractHorse this]
    (-> this (.getEyeHeight))))

(defn get-talk-interval
  "returns: `int`"
  (^Integer [^AbstractHorse this]
    (-> this (.getTalkInterval))))

(defn get-horse-jump-strength
  "returns: `double`"
  (^Double [^AbstractHorse this]
    (-> this (.getHorseJumpStrength))))

(defn can-be-leashed-to?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeLeashedTo player))))

(defn set-temper
  "temper-in - `int`"
  ([^AbstractHorse this ^Integer temper-in]
    (-> this (.setTemper temper-in))))

(defn armor?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraft.item.ItemStack stack]
    (-> this (.isArmor stack))))

(defn on-update
  ""
  ([^AbstractHorse this]
    (-> this (.onUpdate))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn can-be-steered?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.canBeSteered))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.EntityAgeable`"
  (^net.minecraft.entity.EntityAgeable [^AbstractHorse this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn get-mouth-openness-angle
  "p-110201-1 - `float`

  returns: `float`"
  (^Float [^AbstractHorse this ^Float p-110201-1]
    (-> this (.getMouthOpennessAngle p-110201-1))))

(defn get-rearing-amount
  "p-110223-1 - `float`

  returns: `float`"
  (^Float [^AbstractHorse this ^Float p-110223-1]
    (-> this (.getRearingAmount p-110223-1))))

(defn handle-start-jump
  "p-184775-1 - `int`"
  ([^AbstractHorse this ^Integer p-184775-1]
    (-> this (.handleStartJump p-184775-1))))

(defn increase-temper
  "p-110198-1 - `int`

  returns: `int`"
  (^Integer [^AbstractHorse this ^Integer p-110198-1]
    (-> this (.increaseTemper p-110198-1))))

(defn set-scale-for-age
  "child - `boolean`"
  ([^AbstractHorse this ^Boolean child]
    (-> this (.setScaleForAge child))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^AbstractHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn horse-jumping?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isHorseJumping))))

(defn get-max-temper
  "returns: `int`"
  (^Integer [^AbstractHorse this]
    (-> this (.getMaxTemper))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^AbstractHorse this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-temper
  "returns: `int`"
  (^Integer [^AbstractHorse this]
    (-> this (.getTemper))))

(defn set-breeding
  "breeding - `boolean`"
  ([^AbstractHorse this ^Boolean breeding]
    (-> this (.setBreeding breeding))))

(defn on-ladder?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isOnLadder))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^AbstractHorse this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^AbstractHorse this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn can-be-saddled?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.canBeSaddled))))

(defn set-horse-jumping
  "jumping - `boolean`"
  ([^AbstractHorse this ^Boolean jumping]
    (-> this (.setHorseJumping jumping))))

(defn get-controlling-passenger
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^AbstractHorse this]
    (-> this (.getControllingPassenger))))

(defn horse-saddled?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isHorseSaddled))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^AbstractHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn eating-haystack?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isEatingHaystack))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn update-passenger
  "passenger - `net.minecraft.entity.Entity`"
  ([^AbstractHorse this ^net.minecraft.entity.Entity passenger]
    (-> this (.updatePassenger passenger))))

(defn set-owner-unique-id
  "unique-id - `java.util.UUID`"
  ([^AbstractHorse this ^java.util.UUID unique-id]
    (-> this (.setOwnerUniqueId unique-id))))

(defn make-mad
  ""
  ([^AbstractHorse this]
    (-> this (.makeMad))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn on-inventory-changed
  "inv-basic - `net.minecraft.inventory.IInventory`"
  ([^AbstractHorse this ^net.minecraft.inventory.IInventory inv-basic]
    (-> this (.onInventoryChanged inv-basic))))

(defn wears-armor
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.wearsArmor))))

(defn get-horse-size
  "returns: `float`"
  (^Float [^AbstractHorse this]
    (-> this (.getHorseSize))))

(defn tame?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isTame))))

(defn can-eat-grass?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.canEatGrass))))

(defn set-rearing
  "rearing - `boolean`"
  ([^AbstractHorse this ^Boolean rearing]
    (-> this (.setRearing rearing))))

(defn get-grass-eating-amount
  "p-110258-1 - `float`

  returns: `float`"
  (^Float [^AbstractHorse this ^Float p-110258-1]
    (-> this (.getGrassEatingAmount p-110258-1))))

(defn breeding?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isBreeding))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn get-owner-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^AbstractHorse this]
    (-> this (.getOwnerUniqueId))))

(defn set-horse-tamed
  "tamed - `boolean`"
  ([^AbstractHorse this ^Boolean tamed]
    (-> this (.setHorseTamed tamed))))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^AbstractHorse this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn rearing?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.isRearing))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^AbstractHorse this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn open-gui
  "player-entity - `net.minecraft.entity.player.EntityPlayer`"
  ([^AbstractHorse this ^net.minecraft.entity.player.EntityPlayer player-entity]
    (-> this (.openGUI player-entity))))

(defn set-eating-haystack
  "p-110227-1 - `boolean`"
  ([^AbstractHorse this ^Boolean p-110227-1]
    (-> this (.setEatingHaystack p-110227-1))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^AbstractHorse this]
    (-> this (.canBePushed))))

(defn handle-stop-jump
  ""
  ([^AbstractHorse this]
    (-> this (.handleStopJump))))

(defn handle-status-update
  "id - `byte`"
  ([^AbstractHorse this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-max-spawned-in-chunk
  "returns: `int`"
  (^Integer [^AbstractHorse this]
    (-> this (.getMaxSpawnedInChunk))))

(defn set-horse-saddled
  "saddled - `boolean`"
  ([^AbstractHorse this ^Boolean saddled]
    (-> this (.setHorseSaddled saddled))))

(defn on-living-update
  ""
  ([^AbstractHorse this]
    (-> this (.onLivingUpdate))))

