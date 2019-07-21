(ns net.minecraft.item.Item
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item Item]))

(defn ->item
  "Constructor."
  (^Item []
    (new Item )))

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespaced<net.minecraft.util.ResourceLocation,net.minecraft.item.Item>"
  Item/REGISTRY)

(defn *get-id-from-item
  "item-in - `net.minecraft.item.Item`

  returns: `int`"
  (^Integer [^net.minecraft.item.Item item-in]
    (Item/getIdFromItem item-in)))

(defn *get-item-by-id
  "id - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Integer id]
    (Item/getItemById id)))

(defn *get-item-from-block
  "block-in - `net.minecraft.block.Block`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^net.minecraft.block.Block block-in]
    (Item/getItemFromBlock block-in)))

(defn *get-by-name-or-id
  "id - `java.lang.String`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^java.lang.String id]
    (Item/getByNameOrId id)))

(defn *register-items
  ""
  ([]
    (Item/registerItems )))

(defn get-smelting-experience
  "Determines the base experience for a player when they remove this item from a furnace slot.
   This number must be between 0 and 1 for it to be valid.
   This number will be multiplied by the stack size to get the total experience.

  item - The item stack the player is picking up. - `net.minecraft.item.ItemStack`

  returns: The amount to award for each item. - `float`"
  (^Float [^Item this ^net.minecraft.item.ItemStack item]
    (-> this (.getSmeltingExperience item))))

(defn create-entity
  "This function should return a new entity to replace the dropped item.
   Returning null here will not kill the EntityItem and will leave it to function normally.
   Called when the item it placed in a world.

  world - The world object - `net.minecraft.world.World`
  location - The EntityItem object, useful for getting the position of the entity - `net.minecraft.entity.Entity`
  itemstack - The current item stack - `net.minecraft.item.ItemStack`

  returns: A new Entity object to spawn or null - `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Item this ^net.minecraft.world.World world ^net.minecraft.entity.Entity location ^net.minecraft.item.ItemStack itemstack]
    (-> this (.createEntity world location itemstack))))

(defn map?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.isMap))))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack)))
  (^java.lang.String [^Item this]
    (-> this (.getUnlocalizedName))))

(defn get-item-stack-limit
  "Gets the maximum number of items that this stack should be able to hold.
   This is a ItemStack (and thus NBT) sensitive version of Item.getItemStackLimit()

  stack - The ItemStack - `net.minecraft.item.ItemStack`

  returns: The maximum number this item can be stacked to - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackLimit stack)))
  (^Integer [^Item this]
    (-> this (.getItemStackLimit))))

(defn on-block-start-break
  "Called before a block is broken.  Return true to prevent default block harvesting.

   Note: In SMP, this is called on both client and server sides!

  itemstack - The current ItemStack - `net.minecraft.item.ItemStack`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`
  player - The Player that is wielding the item - `net.minecraft.entity.player.EntityPlayer`

  returns: True to prevent harvesting, false to continue as normal - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack itemstack ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onBlockStartBreak itemstack pos player))))

(defn set-container-item
  "container-item - `net.minecraft.item.Item`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this ^net.minecraft.item.Item container-item]
    (-> this (.setContainerItem container-item))))

(defn render-helmet-overlay
  "Called when the client starts rendering the HUD, for whatever item the player currently has as a helmet.
   This is where pumpkins would render there overlay.

  stack - The ItemStack that is equipped - `net.minecraft.item.ItemStack`
  player - Reference to the current client entity - `net.minecraft.entity.player.EntityPlayer`
  resolution - Resolution information about the current viewport and configured GUI Scale - `net.minecraft.client.gui.ScaledResolution`
  partial-ticks - Partial ticks for the renderer, useful for interpolation - `float`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.gui.ScaledResolution resolution ^Float partial-ticks]
    (-> this (.renderHelmetOverlay stack player resolution partial-ticks))))

(defn should-rotate-around-when-rendering?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.shouldRotateAroundWhenRendering))))

(defn on-item-use-finish
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish stack world-in entity-living))))

(defn on-update
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`
  item-slot - `int`
  is-selected - `boolean`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in ^Integer item-slot ^Boolean is-selected]
    (-> this (.onUpdate stack world-in entity-in item-slot is-selected))))

(defn damaged?
  "Return if this itemstack is damaged. Note only called if isDamageable() is true.

  stack - the stack - `net.minecraft.item.ItemStack`

  returns: if the stack is damaged - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.isDamaged stack))))

(defn can-apply-at-enchanting-table?
  "Checks whether an item can be enchanted with a certain enchantment. This applies specifically to enchanting an item in the enchanting table and is called when retrieving the list of possible enchantments for an item.
   Enchantments may additionally (or exclusively) be doing their own checks in Enchantment.canApplyAtEnchantingTable(ItemStack); check the individual implementation for reference.
   By default this will check if the enchantment type is valid for this item type.

  stack - the item stack to be enchanted - `net.minecraft.item.ItemStack`
  enchantment - the enchantment to be applied - `net.minecraft.enchantment.Enchantment`

  returns: true if the enchantment can be applied to this item - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.enchantment.Enchantment enchantment]
    (-> this (.canApplyAtEnchantingTable stack enchantment))))

(defn get-container-item
  "ItemStack sensitive version of getContainerItem.
   Returns a full ItemStack instance of the result.

  item-stack - The current ItemStack - `net.minecraft.item.ItemStack`

  returns: The resulting ItemStack - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Item this ^net.minecraft.item.ItemStack item-stack]
    (-> this (.getContainerItem item-stack)))
  (^net.minecraft.item.Item [^Item this]
    (-> this (.getContainerItem))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^Item this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn get-nbt-share-tag
  "Override this method to change the NBT data being sent to the client.
   You should ONLY override this when you have no other choice, as this might change behavior client side!

  stack - The stack to send the NBT tag for - `net.minecraft.item.ItemStack`

  returns: The NBT tag - `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getNBTShareTag stack))))

(defn can-harvest-block?
  "ItemStack sensitive version of canHarvestBlock(IBlockState)

  state - The block trying to harvest - `net.minecraft.block.state.IBlockState`
  stack - The itemstack used to harvest the block - `net.minecraft.item.ItemStack`

  returns: true if can harvest the block - `boolean`"
  (^Boolean [^Item this ^net.minecraft.block.state.IBlockState state ^net.minecraft.item.ItemStack stack]
    (-> this (.canHarvestBlock state stack)))
  (^Boolean [^Item this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.canHarvestBlock block-in))))

(defn set-no-repair
  "Call to disable repair recipes.

  returns: The current Item instance - `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this]
    (-> this (.setNoRepair))))

(defn on-item-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^Item this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn on-entity-swing
  "Called when a entity tries to play the 'swing' animation.

  entity-living - The entity swinging the item. - `net.minecraft.entity.EntityLivingBase`
  stack - The Item stack - `net.minecraft.item.ItemStack`

  returns: True to cancel any further processing by EntityLiving - `boolean`"
  (^Boolean [^Item this ^net.minecraft.entity.EntityLivingBase entity-living ^net.minecraft.item.ItemStack stack]
    (-> this (.onEntitySwing entity-living stack))))

(defn should-cause-block-break-reset?
  "Called when the player is mining a block and the item in his hand changes.
   Allows to not reset blockbreaking if only NBT or similar changes.

  old-stack - The old stack that was used for mining. Item in players main hand - `net.minecraft.item.ItemStack`
  new-stack - The new stack - `net.minecraft.item.ItemStack`

  returns: True to reset block break progress - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack old-stack ^net.minecraft.item.ItemStack new-stack]
    (-> this (.shouldCauseBlockBreakReset old-stack new-stack))))

(defn has-custom-properties?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.hasCustomProperties))))

(defn book-enchantable?
  "Allow or forbid the specific book/item combination as an anvil enchant

  stack - The item - `net.minecraft.item.ItemStack`
  book - The book - `net.minecraft.item.ItemStack`

  returns: if the enchantment is allowed - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.item.ItemStack book]
    (-> this (.isBookEnchantable stack book))))

(defn repairable?
  "Called by CraftingManager to determine if an item is reparable.

  returns: True if reparable - `boolean`"
  (^Boolean [^Item this]
    (-> this (.isRepairable))))

(defn get-harvest-level
  "Queries the harvest level of this item stack for the specified tool class,
   Returns -1 if this tool is not of the specified type

  stack - This item stack instance - `net.minecraft.item.ItemStack`
  tool-class - Tool Class - `java.lang.String`
  player - The player trying to harvest the given blockstate - `net.minecraft.entity.player.EntityPlayer`
  block-state - The block to harvest - `net.minecraft.block.state.IBlockState`

  returns: Harvest level, or -1 if not the specified tool type. - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack ^java.lang.String tool-class ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.block.state.IBlockState block-state]
    (-> this (.getHarvestLevel stack tool-class player block-state))))

(defn get-tool-classes
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getToolClasses stack))))

(defn get-armor-texture
  "Called by RenderBiped and RenderPlayer to determine the armor texture that
   should be use for the currently equipped item.
   This will only be called on instances of ItemArmor.

   Returning null from this function will use the default value.

  stack - ItemStack for the equipped armor - `net.minecraft.item.ItemStack`
  entity - The entity wearing the armor - `net.minecraft.entity.Entity`
  slot - The slot the armor is in - `net.minecraft.inventory.EntityEquipmentSlot`
  type - The subtype, can be null or \"overlay\" - `java.lang.String`

  returns: Path of texture to bind, or null to use default - `java.lang.String`"
  (^java.lang.String [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.Entity entity ^net.minecraft.inventory.EntityEquipmentSlot slot ^java.lang.String type]
    (-> this (.getArmorTexture stack entity slot type))))

(defn full-3-d?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.isFull3D))))

(defn set-has-subtypes
  "has-subtypes - `boolean`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this ^Boolean has-subtypes]
    (-> this (.setHasSubtypes has-subtypes))))

(defn on-using-tick
  "Called each tick while using an item.

  stack - The Item being used - `net.minecraft.item.ItemStack`
  player - The Player using the item - `net.minecraft.entity.EntityLivingBase`
  count - The amount of time in tick the item has been used for continuously - `int`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase player ^Integer count]
    (-> this (.onUsingTick stack player count))))

(defn get-damage
  "Return the itemDamage represented by this ItemStack. Defaults to the itemDamage field on ItemStack, but can be overridden here for other sources such as NBT.

  stack - The itemstack that is damaged - `net.minecraft.item.ItemStack`

  returns: the damage value - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getDamage stack))))

(defn update-item-stack-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.updateItemStackNBT nbt))))

(defn on-entity-item-update
  "Called by the default implemetation of EntityItem's onUpdate method, allowing for cleaner
   control over the update of the item without having to write a subclass.

  entity-item - The entity Item - `net.minecraft.entity.item.EntityItem`

  returns: Return true to skip any further update code. - `boolean`"
  (^Boolean [^Item this ^net.minecraft.entity.item.EntityItem entity-item]
    (-> this (.onEntityItemUpdate entity-item))))

(defn does-sneak-bypass-use
  "Should this item, when held, allow sneak-clicks to pass through to the underlying block?

  stack - `net.minecraft.item.ItemStack`
  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  player - The Player that is wielding the item - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.doesSneakBypassUse stack world pos player))))

(defn on-armor-tick
  "Called to tick armor in the armor slot. Override to do something

  world - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  item-stack - `net.minecraft.item.ItemStack`"
  ([^Item this ^net.minecraft.world.World world ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack item-stack]
    (-> this (.onArmorTick world player item-stack))))

(defn get-attribute-modifiers
  "ItemStack sensitive version of getItemAttributeModifiers

  slot - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^Item this ^net.minecraft.inventory.EntityEquipmentSlot slot ^net.minecraft.item.ItemStack stack]
    (-> this (.getAttributeModifiers slot stack))))

(defn set-max-stack-size
  "max-stack-size - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this ^Integer max-stack-size]
    (-> this (.setMaxStackSize max-stack-size))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-str-vs-block
  "stack - `net.minecraft.item.ItemStack`
  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock stack state))))

(defn get-max-item-use-duration
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxItemUseDuration stack))))

(defn has-container-item?
  "ItemStack sensitive version of hasContainerItem

  stack - The current item stack - `net.minecraft.item.ItemStack`

  returns: True if this item has a 'container' - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasContainerItem stack)))
  (^Boolean [^Item this]
    (-> this (.hasContainerItem))))

(defn get-share-tag?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.getShareTag))))

(defn enchantable?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.isEnchantable stack))))

(defn set-max-damage
  "max-damage-in - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this ^Integer max-damage-in]
    (-> this (.setMaxDamage max-damage-in))))

(defn show-durability-bar
  "Determines if the durability bar should be rendered for this item.
   Defaults to vanilla stack.isDamaged behavior.
   But modders can use this for any data they wish.

  stack - The current Item Stack - `net.minecraft.item.ItemStack`

  returns: True if it should render the 'durability' bar. - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.showDurabilityBar stack))))

(defn get-rarity
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getRarity stack))))

(defn item-interaction-for-entity
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.EntityLivingBase`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.util.EnumHand hand]
    (-> this (.itemInteractionForEntity stack player-in target hand))))

(defn set-creative-tab
  "tab - `net.minecraft.creativetab.CreativeTabs`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this ^net.minecraft.creativetab.CreativeTabs tab]
    (-> this (.setCreativeTab tab))))

(defn beacon-payment?
  "Whether this Item can be used as a payment to activate the vanilla beacon.

  stack - the ItemStack - `net.minecraft.item.ItemStack`

  returns: true if this Item can be used - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBeaconPayment stack))))

(defn on-created
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onCreated stack world-in player-in))))

(defn on-item-use-first
  "This is called when the item is used, before the block is activated.

  player - The Player that used the item - `net.minecraft.entity.player.EntityPlayer`
  world - The Current World - `net.minecraft.world.World`
  pos - Target position - `net.minecraft.util.math.BlockPos`
  side - The side of the target hit - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`
  hand - Which hand the item is being held in. - `net.minecraft.util.EnumHand`

  returns: Return PASS to allow vanilla handling, any other to skip normal code. - `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^Item this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^Float hit-x ^Float hit-y ^Float hit-z ^net.minecraft.util.EnumHand hand]
    (-> this (.onItemUseFirst player world pos side hit-x hit-y hit-z hand))))

(defn get-creative-tabs
  "Gets a list of tabs that items belonging to this class can display on,
   combined properly with getSubItems allows for a single item to span
   many sub-items across many tabs.

  returns: A list of all tabs that this item could possibly be one. - `net.minecraft.creativetab.CreativeTabs[]`"
  ([^Item this]
    (-> this (.getCreativeTabs))))

(defn on-dropped-by-player
  "Called when a player drops the item into the world,
   returning false from this will prevent the item from
   being removed from the players inventory and spawning
   in the world

  item - The item stack, before the item is removed. - `net.minecraft.item.ItemStack`
  player - The player that dropped the item - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack item ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onDroppedByPlayer item player))))

(defn get-animation-parameters
  "stack - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  entity - `net.minecraft.entity.EntityLivingBase`

  returns: `com.google.common.collect.ImmutableMap<java.lang.String,net.minecraftforge.common.animation.ITimeValue>`"
  (^com.google.common.collect.ImmutableMap [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world ^net.minecraft.entity.EntityLivingBase entity]
    (-> this (.getAnimationParameters stack world entity))))

(defn get-is-repairable?
  "to-repair - `net.minecraft.item.ItemStack`
  repair - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack to-repair ^net.minecraft.item.ItemStack repair]
    (-> this (.getIsRepairable to-repair repair))))

(defn get-highlight-tip
  "Allow the item one last chance to modify its name used for the
   tool highlight useful for adding something extra that can't be removed
   by a user in the displayed name, such as a mode of operation.

  item - the ItemStack for the item. - `net.minecraft.item.ItemStack`
  display-name - the name that will be displayed unless it is changed in this method. - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^Item this ^net.minecraft.item.ItemStack item ^java.lang.String display-name]
    (-> this (.getHighlightTip item display-name))))

(defn on-player-stopped-using
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`
  time-left - `int`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living ^Integer time-left]
    (-> this (.onPlayerStoppedUsing stack world-in entity-living time-left))))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))

(defn get-max-damage
  "Return the maxDamage for this ItemStack. Defaults to the maxDamage field in this item,
   but can be overridden here for other sources such as NBT.

  stack - The itemstack that is damaged - `net.minecraft.item.ItemStack`

  returns: the damage value - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxDamage stack)))
  (^Integer [^Item this]
    (-> this (.getMaxDamage))))

(defn valid-armor?
  "Determines if the specific ItemStack can be placed in the specified armor slot.

  stack - The ItemStack - `net.minecraft.item.ItemStack`
  armor-type - Armor slot ID: 0: Helmet, 1: Chest, 2: Legs, 3: Boots - `net.minecraft.inventory.EntityEquipmentSlot`
  entity - The entity trying to equip the armor - `net.minecraft.entity.Entity`

  returns: True if the given ItemStack can be inserted in the slot - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.inventory.EntityEquipmentSlot armor-type ^net.minecraft.entity.Entity entity]
    (-> this (.isValidArmor stack armor-type entity))))

(defn on-left-click-entity
  "Called when the player Left Clicks (attacks) an entity.
   Processed before damage is done, if return value is true further processing is canceled
   and the entity is not attacked.

  stack - The Item being used - `net.minecraft.item.ItemStack`
  player - The player that is attacking - `net.minecraft.entity.player.EntityPlayer`
  entity - The entity being attacked - `net.minecraft.entity.Entity`

  returns: True to cancel the rest of the interaction. - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity entity]
    (-> this (.onLeftClickEntity stack player entity))))

(defn set-full-3-d
  "returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this]
    (-> this (.setFull3D))))

(defn get-durability-for-display
  "Queries the percentage of the 'Durability' bar that should be drawn.

  stack - The current ItemStack - `net.minecraft.item.ItemStack`

  returns: 1.0 for 100% 0 for 0% - `double`"
  (^Double [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getDurabilityForDisplay stack))))

(defn get-creative-tab
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^Item this]
    (-> this (.getCreativeTab))))

(defn damageable?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.isDamageable))))

(defn get-armor-model
  "Override this method to have an item handle its own armor rendering.

  entity-living - The entity wearing the armor - `net.minecraft.entity.EntityLivingBase`
  item-stack - The itemStack to render the model of - `net.minecraft.item.ItemStack`
  armor-slot - The slot the armor is in - `net.minecraft.inventory.EntityEquipmentSlot`
  default - Original armor model. Will have attributes set. - `net.minecraft.client.model.ModelBiped`

  returns: A ModelBiped to render instead of the default - `net.minecraft.client.model.ModelBiped`"
  (^net.minecraft.client.model.ModelBiped [^Item this ^net.minecraft.entity.EntityLivingBase entity-living ^net.minecraft.item.ItemStack item-stack ^net.minecraft.inventory.EntityEquipmentSlot armor-slot ^net.minecraft.client.model.ModelBiped default]
    (-> this (.getArmorModel entity-living item-stack armor-slot default))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^Item this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn set-unlocalized-name
  "unlocalized-name - `java.lang.String`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item this ^java.lang.String unlocalized-name]
    (-> this (.setUnlocalizedName unlocalized-name))))

(defn get-unlocalized-name-inefficiently
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedNameInefficiently stack))))

(defn get-property-getter
  "key - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.item.IItemPropertyGetter`"
  (^net.minecraft.item.IItemPropertyGetter [^Item this ^net.minecraft.util.ResourceLocation key]
    (-> this (.getPropertyGetter key))))

(defn get-metadata
  "This used to be 'display damage' but its really just 'aux' data in the ItemStack, usually shares the same variable as damage.

  stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMetadata stack))))

(defn hit-entity
  "stack - `net.minecraft.item.ItemStack`
  target - `net.minecraft.entity.EntityLivingBase`
  attacker - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.entity.EntityLivingBase attacker]
    (-> this (.hitEntity stack target attacker))))

(defn should-cause-reequip-animation?
  "Determine if the player switching between these two item stacks

  old-stack - The old stack that was equipped - `net.minecraft.item.ItemStack`
  new-stack - The new stack - `net.minecraft.item.ItemStack`
  slot-changed - If the current equipped slot was changed, Vanilla does not play the animation if you switch between two slots that hold the exact same item. - `boolean`

  returns: True to play the item change animation - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack old-stack ^net.minecraft.item.ItemStack new-stack ^Boolean slot-changed]
    (-> this (.shouldCauseReequipAnimation old-stack new-stack slot-changed))))

(defn get-entity-lifespan
  "Retrieves the normal 'lifespan' of this item when it is dropped on the ground as a EntityItem.
   This is in ticks, standard result is 6000, or 5 mins.

  item-stack - The current ItemStack - `net.minecraft.item.ItemStack`
  world - The world the entity is in - `net.minecraft.world.World`

  returns: The normal lifespan in ticks. - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack item-stack ^net.minecraft.world.World world]
    (-> this (.getEntityLifespan item-stack world))))

(defn get-font-renderer
  "Returns the font renderer used to render tooltips and overlays for this item.
   Returning null will use the standard font renderer.

  stack - The current item stack - `net.minecraft.item.ItemStack`

  returns: A instance of FontRenderer or null to use default - `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getFontRenderer stack))))

(defn can-item-edit-blocks?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.canItemEditBlocks))))

(defn set-harvest-level
  "Sets or removes the harvest level for the specified tool class.

  tool-class - Class - `java.lang.String`
  level - Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0 - `int`"
  ([^Item this ^java.lang.String tool-class ^Integer level]
    (-> this (.setHarvestLevel tool-class level))))

(defn init-capabilities
  "Called from ItemStack.setItem, will hold extra data for the life of this ItemStack.
   Can be retrieved from stack.getCapabilities()
   The NBT can be null if this is not called from readNBT or if the item the stack is
   changing FROM is different then this item, or the previous item had no capabilities.

   This is called BEFORE the stacks item is set so you can use stack.getItem() to see the OLD item.
   Remember that getItem CAN return null.

  stack - The ItemStack - `net.minecraft.item.ItemStack`
  nbt - NBT of this item serialized, or null. - `net.minecraft.nbt.NBTTagCompound`

  returns: A holder instance associated with this ItemStack where you can hold capabilities for the life of this item. - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^net.minecraftforge.common.capabilities.ICapabilityProvider [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.initCapabilities stack nbt))))

(defn get-item-attribute-modifiers
  "Deprecated.

  equipment-slot - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `com.google.common.collect.Multimap<java.lang.String,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^com.google.common.collect.Multimap [^Item this ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot]
    (-> this (.getItemAttributeModifiers equipment-slot))))

(defn get-has-subtypes?
  "returns: `boolean`"
  (^Boolean [^Item this]
    (-> this (.getHasSubtypes))))

(defn add-property-override
  "key - `net.minecraft.util.ResourceLocation`
  getter - `net.minecraft.item.IItemPropertyGetter`"
  ([^Item this ^net.minecraft.util.ResourceLocation key ^net.minecraft.item.IItemPropertyGetter getter]
    (-> this (.addPropertyOverride key getter))))

(defn set-damage
  "Set the damage for this itemstack. Note, this method is responsible for zero checking.

  stack - the stack - `net.minecraft.item.ItemStack`
  damage - the new damage value - `int`"
  ([^Item this ^net.minecraft.item.ItemStack stack ^Integer damage]
    (-> this (.setDamage stack damage))))

(defn has-custom-entity?
  "Determines if this Item has a special entity for when they are in the world.
   Is called when a EntityItem is spawned in the world, if true and Item#createCustomEntity
   returns non null, the EntityItem will be destroyed and the new Entity will be added to the world.

  stack - The current item stack - `net.minecraft.item.ItemStack`

  returns: True of the item has a custom entity, If true, Item#createCustomEntity will be called - `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasCustomEntity stack))))

(defn get-default-instance
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Item this]
    (-> this (.getDefaultInstance))))

(defn get-item-use-action
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemUseAction stack))))

(defn get-rgb-durability-for-display
  "Returns the packed int RGB value used to render the durability bar in the GUI.
   Defaults to a value based on the hue scaled as the damage decreases, but can be overriden.

  stack - Stack to get durability from - `net.minecraft.item.ItemStack`

  returns: A packed RGB value for the durability colour (0x00RRGGBB) - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getRGBDurabilityForDisplay stack))))

(defn on-block-destroyed
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^Item this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onBlockDestroyed stack world-in state pos entity-living))))

(defn get-item-enchantability
  "ItemStack sensitive version of getItemEnchantability

  stack - The ItemStack - `net.minecraft.item.ItemStack`

  returns: the item echantability value - `int`"
  (^Integer [^Item this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemEnchantability stack)))
  (^Integer [^Item this]
    (-> this (.getItemEnchantability))))

