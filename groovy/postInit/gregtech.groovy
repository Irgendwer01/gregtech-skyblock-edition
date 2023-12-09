crafting.removeByOutput(metaitem('steam_rock_breaker_bronze'))
crafting.removeByOutput(metaitem('steam_macerator_bronze'))
mods.gregtech.rock_breaker.removeByInput(960, [item('gregtech:stone_smooth', 1)], null)
mods.gregtech.rock_breaker.removeByInput(960, [item('gregtech:stone_smooth')], null)
mods.gregtech.rock_breaker.removeByInput(240, [item('chisel:basalt')], null)
mods.gregtech.rock_breaker.removeByInput(240, [item('chisel:marble')], null)
// Oil * 80
mods.gregtech.centrifuge.removeByInput(80, [item('minecraft:soul_sand')], null)




crafting.addShaped('steam_macerator', metaitem('steam_macerator_bronze'), [
 [metaitem('toolHeadBuzzSawWroughtIron'), metaitem('pipeSmallFluidBronze'), item('minecraft:flint')],
 [metaitem('pipeSmallFluidBronze'), item('gregtech:steam_casing'), metaitem('pipeSmallFluidBronze')],
 [item('minecraft:piston'), metaitem('pipeSmallFluidBronze'), item('minecraft:piston')]])

crafting.addShaped('steam_rock_breaker', metaitem('steam_rock_breaker_bronze'), [
 [item('minecraft:piston'), metaitem('pipeSmallFluidBronze'), item('minecraft:piston')],
 [metaitem('pipeSmallFluidBronze'), item('gregtech:steam_casing'), metaitem('pipeSmallFluidBronze')],
 [metaitem('toolHeadBuzzSawWroughtIron'), metaitem('pipeSmallFluidBronze'), item('minecraft:flint')]])

mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneBasalt'))
  .outputs(item('gregtech:stone_smooth', 3))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneMarble'))
  .outputs(item('gregtech:stone_smooth', 2))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGraniteBlack'))
  .outputs(item('gregtech:stone_smooth'))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGraniteRed'))
  .outputs(item('gregtech:stone_smooth', 1))
  .EUt(7)
  .duration(16)
  .buildAndRegister()


// Oil * 80
mods.gregtech.centrifuge.recipeBuilder()
  .inputs(item('minecraft:soul_sand'))
  .fluidOutputs(fluid('oil') * 80)
  .chancedOutput(item('minecraft:sand'), 9000, 130)
  .chancedOutput(metaitem('dustTinyCoal'), 2000, 340)
  .chancedOutput(metaitem('dustTinySaltpeter'), 8000, 480)
  .duration(400)
  .EUt(20)
  .buildAndRegister()
