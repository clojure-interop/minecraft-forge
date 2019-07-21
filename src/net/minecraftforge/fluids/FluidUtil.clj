(ns net.minecraftforge.fluids.FluidUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidUtil]))

(defn *try-place-fluid
  "Tries to place a fluid in the world in block form and drains the container.
   Makes a fluid emptying sound when successful.
   Honors the amount of fluid contained by the used container.
   Checks if water-like fluids should vaporize like in the nether.

   Modeled after ItemBucket.tryPlaceContainedLiquid(EntityPlayer, World, BlockPos)

  player - Player who places the fluid. May be null for blocks like dispensers. - `net.minecraft.entity.player.EntityPlayer`
  world - World to place the fluid in - `net.minecraft.world.World`
  pos - The position in the world to place the fluid block - `net.minecraft.util.math.BlockPos`
  container - The fluid container holding the fluidStack to place - `net.minecraft.item.ItemStack`
  resource - The fluidStack to place - `net.minecraftforge.fluids.FluidStack`

  returns: the container's ItemStack with the remaining amount of fluid if the placement was successful, null otherwise - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.item.ItemStack container ^net.minecraftforge.fluids.FluidStack resource]
    (FluidUtil/tryPlaceFluid player world pos container resource)))

(defn *try-fill-container-and-stow
  "Takes an Fluid Container Item and tries to fill it from the given tank.
   If the player is in creative mode, the container will not be modified on success, and no additional items created.
   If the input itemstack has a stacksize > 1 it will stow the filled container in the given inventory.
   If the inventory does not accept it, it will be given to the player or dropped at the players feet.
        If player is null in this case, the action will be aborted.

  container - The Fluid Container ItemStack to fill. Will not be modified directly, if modifications are necessary a modified copy is returned in the result. - `net.minecraft.item.ItemStack`
  fluid-source - The fluid source to fill from - `net.minecraftforge.fluids.capability.IFluidHandler`
  inventory - An inventory where any additionally created item (filled container if multiple empty are present) are put - `net.minecraftforge.items.IItemHandler`
  max-amount - Maximum amount of fluid to take from the tank. - `int`
  player - The player that gets the items the inventory can't take. Can be null, only used if the inventory cannot take the filled stack. - `net.minecraft.entity.player.EntityPlayer`

  returns: a FluidActionResult holding the result and the resulting container. The resulting container is empty on failure. - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.item.ItemStack container ^net.minecraftforge.fluids.capability.IFluidHandler fluid-source ^net.minecraftforge.items.IItemHandler inventory ^Integer max-amount ^net.minecraft.entity.player.EntityPlayer player]
    (FluidUtil/tryFillContainerAndStow container fluid-source inventory max-amount player)))

(defn *try-empty-container-and-stow
  "Takes an Fluid Container Item, tries to empty it into the fluid handler, and stows it in the given inventory.
   If the player is in creative mode, the container will not be modified on success, and no additional items created.
   If the input itemstack has a stacksize > 1 it will stow the emptied container in the given inventory.
   If the inventory does not accept the emptied container, it will be given to the player or dropped at the players feet.
        If player is null in this case, the action will be aborted.

  container - The filled Fluid Container Itemstack to empty. Will not be modified directly, if modifications are necessary a modified copy is returned in the result. - `net.minecraft.item.ItemStack`
  fluid-destination - The fluid destination to fill from the fluid container. - `net.minecraftforge.fluids.capability.IFluidHandler`
  inventory - An inventory where any additionally created item (filled container if multiple empty are present) are put - `net.minecraftforge.items.IItemHandler`
  max-amount - Maximum amount of fluid to take from the tank. - `int`
  player - The player that gets the items the inventory can't take. Can be null, only used if the inventory cannot take the filled stack. - `net.minecraft.entity.player.EntityPlayer`

  returns: a FluidActionResult holding the result and the resulting container. The resulting container is empty on failure. - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.item.ItemStack container ^net.minecraftforge.fluids.capability.IFluidHandler fluid-destination ^net.minecraftforge.items.IItemHandler inventory ^Integer max-amount ^net.minecraft.entity.player.EntityPlayer player]
    (FluidUtil/tryEmptyContainerAndStow container fluid-destination inventory max-amount player)))

(defn *get-fluid-contained
  "Helper method to get the fluid contained in an itemStack

  container - `net.minecraft.item.ItemStack`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^net.minecraft.item.ItemStack container]
    (FluidUtil/getFluidContained container)))

(defn *try-fill-container
  "Fill a container from the given fluidSource.

  container - The container to be filled. Will not be modified. Separate handling must be done to reduce the stack size, stow containers, etc, on success. See tryFillContainerAndStow(ItemStack, IFluidHandler, IItemHandler, int, EntityPlayer). - `net.minecraft.item.ItemStack`
  fluid-source - The fluid handler to be drained. - `net.minecraftforge.fluids.capability.IFluidHandler`
  max-amount - The largest amount of fluid that should be transferred. - `int`
  player - The player to make the filling noise. Pass null for no noise. - `net.minecraft.entity.player.EntityPlayer`
  do-fill - true if the container should actually be filled, false if it should be simulated. - `boolean`

  returns: a FluidActionResult holding the filled container if successful. - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.item.ItemStack container ^net.minecraftforge.fluids.capability.IFluidHandler fluid-source ^Integer max-amount ^net.minecraft.entity.player.EntityPlayer player ^Boolean do-fill]
    (FluidUtil/tryFillContainer container fluid-source max-amount player do-fill)))

(defn *try-pick-up-fluid
  "Attempts to pick up a fluid in the world and put it in an empty container item.

  empty-container - The empty container to fill. Will not be modified directly, if modifications are necessary a modified copy is returned in the result. - `net.minecraft.item.ItemStack`
  player-in - The player filling the container. Optional. - `net.minecraft.entity.player.EntityPlayer`
  world-in - The world the fluid is in. - `net.minecraft.world.World`
  pos - The position of the fluid in the world. - `net.minecraft.util.math.BlockPos`
  side - The side of the fluid that is being drained. - `net.minecraft.util.EnumFacing`

  returns: a FluidActionResult holding the result and the resulting container. - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.item.ItemStack empty-container ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (FluidUtil/tryPickUpFluid empty-container player-in world-in pos side)))

(defn *get-fluid-handler
  "Helper method to get an IFluidHandler for at a block position.

   Returns null if there is no valid fluid handler.

  world - `net.minecraft.world.World`
  block-pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `net.minecraftforge.fluids.capability.IFluidHandler`"
  (^net.minecraftforge.fluids.capability.IFluidHandler [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos block-pos ^net.minecraft.util.EnumFacing side]
    (FluidUtil/getFluidHandler world block-pos side))
  (^net.minecraftforge.fluids.capability.IFluidHandlerItem [^net.minecraft.item.ItemStack item-stack]
    (FluidUtil/getFluidHandler item-stack)))

(defn *try-empty-container
  "Takes a filled container and tries to empty it into the given tank.

  container - The filled container. Will not be modified. Separate handling must be done to reduce the stack size, stow containers, etc, on success. See tryEmptyContainerAndStow(ItemStack, IFluidHandler, IItemHandler, int, EntityPlayer). - `net.minecraft.item.ItemStack`
  fluid-destination - The fluid handler to be filled by the container. - `net.minecraftforge.fluids.capability.IFluidHandler`
  max-amount - The largest amount of fluid that should be transferred. - `int`
  player - Player for making the bucket drained sound. Pass null for no noise. - `net.minecraft.entity.player.EntityPlayer`
  do-drain - true if the container should actually be drained, false if it should be simulated. - `boolean`

  returns: a FluidActionResult holding the empty container if the fluid handler was filled.
           NOTE If the container is consumable, the empty container will be null on success. - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.item.ItemStack container ^net.minecraftforge.fluids.capability.IFluidHandler fluid-destination ^Integer max-amount ^net.minecraft.entity.player.EntityPlayer player ^Boolean do-drain]
    (FluidUtil/tryEmptyContainer container fluid-destination max-amount player do-drain)))

(defn *interact-with-fluid-handler
  "Used to handle the common case of a player holding a fluid item and right-clicking on a fluid handler.
   First it tries to fill the container item from the fluid handler,
   if that action fails then it tries to drain the container item into the fluid handler.

  stack - The filled or empty fluid container. Will not be modified directly, if modifications are necessary a modified copy is returned in the result. - `net.minecraft.item.ItemStack`
  fluid-handler - The fluid handler to interact with. - `net.minecraftforge.fluids.capability.IFluidHandler`
  player - The player doing the interaction between the item and fluid handler. - `net.minecraft.entity.player.EntityPlayer`

  returns: a FluidActionResult holding the result and resulting container. - `net.minecraftforge.fluids.FluidActionResult`"
  (^net.minecraftforge.fluids.FluidActionResult [^net.minecraft.item.ItemStack stack ^net.minecraftforge.fluids.capability.IFluidHandler fluid-handler ^net.minecraft.entity.player.EntityPlayer player]
    (FluidUtil/interactWithFluidHandler stack fluid-handler player)))

(defn *try-fluid-transfer
  "Fill a destination fluid handler from a source fluid handler.

  fluid-destination - The fluid handler to be filled. - `net.minecraftforge.fluids.capability.IFluidHandler`
  fluid-source - The fluid handler to be drained. - `net.minecraftforge.fluids.capability.IFluidHandler`
  max-amount - The largest amount of fluid that should be transferred. - `int`
  do-transfer - True if the transfer should actually be done, false if it should be simulated. - `boolean`

  returns: the fluidStack that was transferred from the source to the destination. null on failure. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^net.minecraftforge.fluids.capability.IFluidHandler fluid-destination ^net.minecraftforge.fluids.capability.IFluidHandler fluid-source ^Integer max-amount ^Boolean do-transfer]
    (FluidUtil/tryFluidTransfer fluid-destination fluid-source max-amount do-transfer)))

