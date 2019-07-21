(ns net.minecraft.entity.EntityLiving
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityLiving]))

(defn ->entity-living
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityLiving [^net.minecraft.world.World world-in]
    (new EntityLiving world-in)))

(defn living-sound-time
  "Instance Field.

  type: int"
  (^Integer [^EntityLiving this]
    (-> this .-livingSoundTime)))

(defn tasks
  "Instance Constant.

  type: net.minecraft.entity.ai.EntityAITasks"
  (^net.minecraft.entity.ai.EntityAITasks [^EntityLiving this]
    (-> this .-tasks)))

(defn target-tasks
  "Instance Constant.

  type: net.minecraft.entity.ai.EntityAITasks"
  (^net.minecraft.entity.ai.EntityAITasks [^EntityLiving this]
    (-> this .-targetTasks)))

(defn *register-fixes-mob
  "fixer - `net.minecraft.util.datafix.DataFixer`
  name - `java.lang.Class`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.Class name]
    (EntityLiving/registerFixesMob fixer name)))

(defn *get-slot-for-item-stack
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.inventory.EntityEquipmentSlot`"
  (^net.minecraft.inventory.EntityEquipmentSlot [^net.minecraft.item.ItemStack stack]
    (EntityLiving/getSlotForItemStack stack)))

(defn *get-armor-by-chance
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  chance - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^net.minecraft.inventory.EntityEquipmentSlot slot-in ^Integer chance]
    (EntityLiving/getArmorByChance slot-in chance)))

(defn *item-stack-in-slot?
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (EntityLiving/isItemStackInSlot slot-in stack)))

(defn get-max-fall-height
  "returns: `int`"
  (^Integer [^EntityLiving this]
    (-> this (.getMaxFallHeight))))

(defn on-entity-update
  ""
  ([^EntityLiving this]
    (-> this (.onEntityUpdate))))

(defn get-talk-interval
  "returns: `int`"
  (^Integer [^EntityLiving this]
    (-> this (.getTalkInterval))))

(defn can-be-leashed-to?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityLiving this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeLeashedTo player))))

(defn get-armor-inventory-list
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityLiving this]
    (-> this (.getArmorInventoryList))))

(defn on-update
  ""
  ([^EntityLiving this]
    (-> this (.onUpdate))))

(defn no-despawn-required?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.isNoDespawnRequired))))

(defn set-leashed-to-entity
  "entity-in - `net.minecraft.entity.Entity`
  send-attach-notification - `boolean`"
  ([^EntityLiving this ^net.minecraft.entity.Entity entity-in ^Boolean send-attach-notification]
    (-> this (.setLeashedToEntity entity-in send-attach-notification))))

(defn can-be-steered?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.canBeSteered))))

(defn set-can-pick-up-loot
  "can-pickup - `boolean`"
  ([^EntityLiving this ^Boolean can-pickup]
    (-> this (.setCanPickUpLoot can-pickup))))

(defn get-horizontal-face-speed
  "returns: `int`"
  (^Integer [^EntityLiving this]
    (-> this (.getHorizontalFaceSpeed))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.getCanSpawnHere))))

(defn get-entity-senses
  "returns: `net.minecraft.entity.ai.EntitySenses`"
  (^net.minecraft.entity.ai.EntitySenses [^EntityLiving this]
    (-> this (.getEntitySenses))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityLiving this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn get-held-equipment
  "returns: `java.lang.Iterable<net.minecraft.item.ItemStack>`"
  (^java.lang.Iterable [^EntityLiving this]
    (-> this (.getHeldEquipment))))

(defn enable-persistence
  ""
  ([^EntityLiving this]
    (-> this (.enablePersistence))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLiving this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn set-move-strafing
  "amount - `float`"
  ([^EntityLiving this ^Float amount]
    (-> this (.setMoveStrafing amount))))

(defn left-handed?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.isLeftHanded))))

(defn set-ai-move-speed
  "speed-in - `float`"
  ([^EntityLiving this ^Float speed-in]
    (-> this (.setAIMoveSpeed speed-in))))

(defn set-drop-chance
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  chance - `float`"
  ([^EntityLiving this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^Float chance]
    (-> this (.setDropChance slot-in chance))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityLiving this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn server-world?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.isServerWorld))))

(defn set-path-priority
  "node-type - `net.minecraft.pathfinding.PathNodeType`
  priority - `float`"
  ([^EntityLiving this ^net.minecraft.pathfinding.PathNodeType node-type ^Float priority]
    (-> this (.setPathPriority node-type priority))))

(defn get-attack-target
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityLiving this]
    (-> this (.getAttackTarget))))

(defn get-vertical-face-speed
  "returns: `int`"
  (^Integer [^EntityLiving this]
    (-> this (.getVerticalFaceSpeed))))

(defn get-move-helper
  "returns: `net.minecraft.entity.ai.EntityMoveHelper`"
  (^net.minecraft.entity.ai.EntityMoveHelper [^EntityLiving this]
    (-> this (.getMoveHelper))))

(defn play-living-sound
  ""
  ([^EntityLiving this]
    (-> this (.playLivingSound))))

(defn not-colliding?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.isNotColliding))))

(defn set-move-forward
  "amount - `float`"
  ([^EntityLiving this ^Float amount]
    (-> this (.setMoveForward amount))))

(defn get-item-stack-from-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityLiving this ^net.minecraft.inventory.EntityEquipmentSlot slot-in]
    (-> this (.getItemStackFromSlot slot-in))))

(defn can-attack-class?
  "cls - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^EntityLiving this ^java.lang.Class cls]
    (-> this (.canAttackClass cls))))

(defn face-entity
  "entity-in - `net.minecraft.entity.Entity`
  max-yaw-increase - `float`
  max-pitch-increase - `float`"
  ([^EntityLiving this ^net.minecraft.entity.Entity entity-in ^Float max-yaw-increase ^Float max-pitch-increase]
    (-> this (.faceEntity entity-in max-yaw-increase max-pitch-increase))))

(defn get-path-priority
  "node-type - `net.minecraft.pathfinding.PathNodeType`

  returns: `float`"
  (^Float [^EntityLiving this ^net.minecraft.pathfinding.PathNodeType node-type]
    (-> this (.getPathPriority node-type))))

(defn can-pick-up-loot?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.canPickUpLoot))))

(defn eat-grass-bonus
  ""
  ([^EntityLiving this]
    (-> this (.eatGrassBonus))))

(defn spawn-explosion-particle
  ""
  ([^EntityLiving this]
    (-> this (.spawnExplosionParticle))))

(defn set-no-ai
  "disable - `boolean`"
  ([^EntityLiving this ^Boolean disable]
    (-> this (.setNoAI disable))))

(defn can-passenger-steer?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.canPassengerSteer))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityLiving this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn clear-leashed
  "send-packet - `boolean`
  drop-lead - `boolean`"
  ([^EntityLiving this ^Boolean send-packet ^Boolean drop-lead]
    (-> this (.clearLeashed send-packet drop-lead))))

(defn get-jump-helper
  "returns: `net.minecraft.entity.ai.EntityJumpHelper`"
  (^net.minecraft.entity.ai.EntityJumpHelper [^EntityLiving this]
    (-> this (.getJumpHelper))))

(defn get-render-size-modifier
  "returns: `float`"
  (^Float [^EntityLiving this]
    (-> this (.getRenderSizeModifier))))

(defn get-leashed?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.getLeashed))))

(defn start-riding
  "entity-in - `net.minecraft.entity.Entity`
  force - `boolean`

  returns: `boolean`"
  (^Boolean [^EntityLiving this ^net.minecraft.entity.Entity entity-in ^Boolean force]
    (-> this (.startRiding entity-in force))))

(defn get-primary-hand
  "returns: `net.minecraft.util.EnumHandSide`"
  (^net.minecraft.util.EnumHandSide [^EntityLiving this]
    (-> this (.getPrimaryHand))))

(defn set-attack-target
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityLiving this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in]
    (-> this (.setAttackTarget entitylivingbase-in))))

(defn ai-disabled?
  "returns: `boolean`"
  (^Boolean [^EntityLiving this]
    (-> this (.isAIDisabled))))

(defn get-leashed-to-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityLiving this]
    (-> this (.getLeashedToEntity))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityLiving this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn set-left-handed
  "disable - `boolean`"
  ([^EntityLiving this ^Boolean disable]
    (-> this (.setLeftHanded disable))))

(defn get-look-helper
  "returns: `net.minecraft.entity.ai.EntityLookHelper`"
  (^net.minecraft.entity.ai.EntityLookHelper [^EntityLiving this]
    (-> this (.getLookHelper))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityLiving this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-navigator
  "returns: `net.minecraft.pathfinding.PathNavigate`"
  (^net.minecraft.pathfinding.PathNavigate [^EntityLiving this]
    (-> this (.getNavigator))))

(defn get-max-spawned-in-chunk
  "returns: `int`"
  (^Integer [^EntityLiving this]
    (-> this (.getMaxSpawnedInChunk))))

(defn on-living-update
  ""
  ([^EntityLiving this]
    (-> this (.onLivingUpdate))))

(defn set-item-stack-to-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityLiving this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStackToSlot slot-in stack))))

