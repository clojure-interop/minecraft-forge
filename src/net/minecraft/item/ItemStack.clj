(ns net.minecraft.item.ItemStack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemStack]))

(defn ->item-stack
  "Constructor.

  item-in - `net.minecraft.item.Item`
  amount - `int`
  meta - `int`
  cap-nbt - `net.minecraft.nbt.NBTTagCompound`"
  (^ItemStack [^net.minecraft.item.Item item-in ^Integer amount ^Integer meta ^net.minecraft.nbt.NBTTagCompound cap-nbt]
    (new ItemStack item-in amount meta cap-nbt))
  (^ItemStack [^net.minecraft.block.Block block-in ^Integer amount ^Integer meta]
    (new ItemStack block-in amount meta))
  (^ItemStack [^net.minecraft.block.Block block-in ^Integer amount]
    (new ItemStack block-in amount))
  (^ItemStack [^net.minecraft.block.Block block-in]
    (new ItemStack block-in)))

(def *-empty
  "Static Constant.

  type: net.minecraft.item.ItemStack"
  ItemStack/EMPTY)

(def *-decimalformat
  "Static Constant.

  type: java.text.DecimalFormat"
  ItemStack/DECIMALFORMAT)

(defn *register-fixes
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (ItemStack/registerFixes fixer)))

(defn *are-item-stack-tags-equal
  "stack-a - `net.minecraft.item.ItemStack`
  stack-b - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack-a ^net.minecraft.item.ItemStack stack-b]
    (ItemStack/areItemStackTagsEqual stack-a stack-b)))

(defn *are-item-stacks-equal
  "stack-a - `net.minecraft.item.ItemStack`
  stack-b - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack-a ^net.minecraft.item.ItemStack stack-b]
    (ItemStack/areItemStacksEqual stack-a stack-b)))

(defn *are-items-equal
  "stack-a - `net.minecraft.item.ItemStack`
  stack-b - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack-a ^net.minecraft.item.ItemStack stack-b]
    (ItemStack/areItemsEqual stack-a stack-b)))

(defn *are-items-equal-ignore-durability
  "stack-a - `net.minecraft.item.ItemStack`
  stack-b - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack-a ^net.minecraft.item.ItemStack stack-b]
    (ItemStack/areItemsEqualIgnoreDurability stack-a stack-b)))

(defn write-to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemStack this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeToNBT nbt))))

(defn can-place-on?
  "block-in - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.block.Block block-in]
    (-> this (.canPlaceOn block-in))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemStack this]
    (-> this (.getUnlocalizedName))))

(defn get-count
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getCount))))

(defn get-enchantment-tag-list
  "returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^ItemStack this]
    (-> this (.getEnchantmentTagList))))

(defn item-equal?
  "other - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.item.ItemStack other]
    (-> this (.isItemEqual other))))

(defn get-item
  "returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^ItemStack this]
    (-> this (.getItem))))

(defn interact-with-entity
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  entity-in - `net.minecraft.entity.EntityLivingBase`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.entity.EntityLivingBase entity-in ^net.minecraft.util.EnumHand hand]
    (-> this (.interactWithEntity player-in entity-in hand))))

(defn item-enchantable?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isItemEnchantable))))

(defn copy
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStack this]
    (-> this (.copy))))

(defn on-item-use-finish
  "world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStack this ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish world-in entity-living))))

(defn update-animation
  "world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`
  inventory-slot - `int`
  is-current-item - `boolean`"
  ([^ItemStack this ^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Integer inventory-slot ^Boolean is-current-item]
    (-> this (.updateAnimation world-in entity-in inventory-slot is-current-item))))

(defn remove-sub-compound
  "key - `java.lang.String`"
  ([^ItemStack this ^java.lang.String key]
    (-> this (.removeSubCompound key))))

(defn set-translatable-name
  "p-190924-1 - `java.lang.String`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStack this ^java.lang.String p-190924-1]
    (-> this (.setTranslatableName p-190924-1))))

(defn can-harvest-block?
  "block-in - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.canHarvestBlock block-in))))

(defn on-item-use
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  side - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemStack this ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing side ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player-in world-in pos hand side hit-x hit-y hit-z))))

(defn add-attribute-modifier
  "attribute-name - `java.lang.String`
  modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`
  equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`"
  ([^ItemStack this ^java.lang.String attribute-name ^net.minecraft.entity.ai.attributes.AttributeModifier modifier ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.addAttributeModifier attribute-name modifier equipment-slot))))

(defn get-sub-compound
  "key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemStack this ^java.lang.String key]
    (-> this (.getSubCompound key))))

(defn item-enchanted?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isItemEnchanted))))

(defn get-or-create-sub-compound
  "key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemStack this ^java.lang.String key]
    (-> this (.getOrCreateSubCompound key))))

(defn attempt-damage-item
  "amount - `int`
  rand - `java.util.Random`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^Integer amount ^java.util.Random rand]
    (-> this (.attemptDamageItem amount rand))))

(defn get-item-damage
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getItemDamage))))

(defn shrink
  "quantity - `int`"
  ([^ItemStack this ^Integer quantity]
    (-> this (.shrink quantity))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemStack this]
    (-> this (.toString))))

(defn get-attribute-modifiers
  "equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^ItemStack this ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.getAttributeModifiers equipment-slot))))

(defn set-item-damage
  "meta - `int`"
  ([^ItemStack this ^Integer meta]
    (-> this (.setItemDamage meta))))

(defn set-tag-info
  "key - `java.lang.String`
  value - `net.minecraft.nbt.NBTBase`"
  ([^ItemStack this ^java.lang.String key ^net.minecraft.nbt.NBTBase value]
    (-> this (.setTagInfo key value))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemStack this]
    (-> this (.getDisplayName))))

(defn has-tag-compound?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.hasTagCompound))))

(defn set-count
  "size - `int`"
  ([^ItemStack this ^Integer size]
    (-> this (.setCount size))))

(defn stackable?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isStackable))))

(defn get-str-vs-block
  "block-in - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^ItemStack this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.getStrVsBlock block-in))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^ItemStack this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-max-item-use-duration
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getMaxItemUseDuration))))

(defn set-repair-cost
  "cost - `int`"
  ([^ItemStack this ^Integer cost]
    (-> this (.setRepairCost cost))))

(defn use-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemStack this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand]
    (-> this (.useItemRightClick world-in player-in hand))))

(defn get-text-component
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ItemStack this]
    (-> this (.getTextComponent))))

(defn get-rarity
  "returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^ItemStack this]
    (-> this (.getRarity))))

(defn can-edit-blocks?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.canEditBlocks))))

(defn has-display-name?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.hasDisplayName))))

(defn serialize-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemStack this]
    (-> this (.serializeNBT))))

(defn add-enchantment
  "ench - `net.minecraft.enchantment.Enchantment`
  level - `int`"
  ([^ItemStack this ^net.minecraft.enchantment.Enchantment ench ^Integer level]
    (-> this (.addEnchantment ench level))))

(defn set-tag-compound
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^ItemStack this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.setTagCompound nbt))))

(defn can-destroy?
  "block-in - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.block.Block block-in]
    (-> this (.canDestroy block-in))))

(defn on-crafting
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  amount - `int`"
  ([^ItemStack this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^Integer amount]
    (-> this (.onCrafting world-in player-in amount))))

(defn on-item-use-first
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  side - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemStack this ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing side ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUseFirst player-in world-in pos hand side hit-x hit-y hit-z))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^ItemStack this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn item-equal-ignore-durability?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemEqualIgnoreDurability stack))))

(defn damage-item
  "amount - `int`
  entity-in - `net.minecraft.entity.EntityLivingBase`"
  ([^ItemStack this ^Integer amount ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.damageItem amount entity-in))))

(defn set-animations-to-go
  "animations - `int`"
  ([^ItemStack this ^Integer animations]
    (-> this (.setAnimationsToGo animations))))

(defn get-tooltip
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  advanced - `boolean`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ItemStack this ^net.minecraft.entity.player.EntityPlayer player-in ^Boolean advanced]
    (-> this (.getTooltip player-in advanced))))

(defn get-item-frame
  "returns: `net.minecraft.entity.item.EntityItemFrame`"
  (^net.minecraft.entity.item.EntityItemFrame [^ItemStack this]
    (-> this (.getItemFrame))))

(defn on-player-stopped-using
  "world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`
  time-left - `int`"
  ([^ItemStack this ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living ^Integer time-left]
    (-> this (.onPlayerStoppedUsing world-in entity-living time-left))))

(defn has-effect?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.hasEffect))))

(defn get-max-damage
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getMaxDamage))))

(defn get-tag-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemStack this]
    (-> this (.getTagCompound))))

(defn get-repair-cost
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getRepairCost))))

(defn split-stack
  "amount - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStack this ^Integer amount]
    (-> this (.splitStack amount))))

(defn item-damaged?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isItemDamaged))))

(defn item-stack-damageable?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isItemStackDamageable))))

(defn set-item-frame
  "frame - `net.minecraft.entity.item.EntityItemFrame`"
  ([^ItemStack this ^net.minecraft.entity.item.EntityItemFrame frame]
    (-> this (.setItemFrame frame))))

(defn set-stack-display-name
  "display-name - `java.lang.String`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStack this ^java.lang.String display-name]
    (-> this (.setStackDisplayName display-name))))

(defn get-max-stack-size
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getMaxStackSize))))

(defn are-caps-compatible
  "other - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemStack this ^net.minecraft.item.ItemStack other]
    (-> this (.areCapsCompatible other))))

(defn get-metadata
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getMetadata))))

(defn hit-entity
  "entity-in - `net.minecraft.entity.EntityLivingBase`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ItemStack this ^net.minecraft.entity.EntityLivingBase entity-in ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.hitEntity entity-in player-in))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isEmpty))))

(defn deserialize-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^ItemStack this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.deserializeNBT nbt))))

(defn on-item-frame?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.isOnItemFrame))))

(defn get-animations-to-go
  "returns: `int`"
  (^Integer [^ItemStack this]
    (-> this (.getAnimationsToGo))))

(defn get-has-subtypes?
  "returns: `boolean`"
  (^Boolean [^ItemStack this]
    (-> this (.getHasSubtypes))))

(defn grow
  "quantity - `int`"
  ([^ItemStack this ^Integer quantity]
    (-> this (.grow quantity))))

(defn clear-custom-name
  ""
  ([^ItemStack this]
    (-> this (.clearCustomName))))

(defn get-item-use-action
  "returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^ItemStack this]
    (-> this (.getItemUseAction))))

(defn on-block-destroyed
  "world-in - `net.minecraft.world.World`
  block-in - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ItemStack this ^net.minecraft.world.World world-in ^net.minecraft.block.state.IBlockState block-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onBlockDestroyed world-in block-in pos player-in))))

