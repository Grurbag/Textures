// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelPistol extends ModelBase {
	private final ModelRenderer gun;
	private final ModelRenderer wood;
	private final ModelRenderer derzhatel;
	private final ModelRenderer priklad;
	private final ModelRenderer priklad_r1;
	private final ModelRenderer kurok2;
	private final ModelRenderer kurok2_r1;
	private final ModelRenderer kurok;
	private final ModelRenderer kurok_r1;

	public WFMModelPistol() {
		textureWidth = 64;
		textureHeight = 64;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.5F, 19.5F, -14.5F);
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.5F, -1.5F, -0.5F, 3, 3, 17, 0.0F, false));

		wood = new ModelRenderer(this);
		wood.setRotationPoint(2.5F, 7.5F, 0.5F);
		gun.addChild(wood);
		wood.cubeList.add(new ModelBox(wood, 2, 20, -3.5F, -6.0F, 2.0F, 2, 2, 13, 0.0F, false));

		derzhatel = new ModelRenderer(this);
		derzhatel.setRotationPoint(0.0F, 0.0F, -7.0F);
		gun.addChild(derzhatel);
		derzhatel.cubeList.add(new ModelBox(derzhatel, 0, 1, -2.0F, -2.0F, 10.5F, 4, 5, 1, 0.0F, false));
		derzhatel.cubeList.add(new ModelBox(derzhatel, 0, 1, -2.0F, -2.0F, 20.5F, 4, 5, 1, 0.0F, false));

		priklad = new ModelRenderer(this);
		priklad.setRotationPoint(0.0F, 2.0F, 18.0F);
		gun.addChild(priklad);
		setRotationAngle(priklad, -0.5236F, 0.0F, 0.0F);
		priklad.cubeList.add(new ModelBox(priklad, 25, 39, -1.01F, -2.0F, -3.0F, 2, 4, 6, 0.0F, false));
		priklad.cubeList.add(new ModelBox(priklad, 0, 39, -1.01F, -2.0F, -3.0F, 2, 4, 6, 0.35F, false));

		priklad_r1 = new ModelRenderer(this);
		priklad_r1.setRotationPoint(0.0F, 1.5F, 4.0F);
		priklad.addChild(priklad_r1);
		setRotationAngle(priklad_r1, 0.5236F, 0.0F, 0.0F);
		priklad_r1.cubeList.add(new ModelBox(priklad_r1, 25, 50, -0.99F, -2.5F, -1.0F, 2, 4, 2, 0.0F, false));
		priklad_r1.cubeList.add(new ModelBox(priklad_r1, 0, 50, -0.99F, -2.5F, -1.0F, 2, 4, 2, 0.35F, false));

		kurok2 = new ModelRenderer(this);
		kurok2.setRotationPoint(0.0F, -4.0F, -2.0F);
		priklad.addChild(kurok2);
		

		kurok2_r1 = new ModelRenderer(this);
		kurok2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		kurok2.addChild(kurok2_r1);
		setRotationAngle(kurok2_r1, 0.5236F, 0.0F, 0.0F);
		kurok2_r1.cubeList.add(new ModelBox(kurok2_r1, 0, 48, 0.0F, -4.0F, -6.0F, 0, 6, 10, 0.0F, false));

		kurok = new ModelRenderer(this);
		kurok.setRotationPoint(0.0F, 4.5F, -2.866F);
		priklad.addChild(kurok);
		

		kurok_r1 = new ModelRenderer(this);
		kurok_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		kurok.addChild(kurok_r1);
		setRotationAngle(kurok_r1, 0.5236F, 0.0F, 0.0F);
		kurok_r1.cubeList.add(new ModelBox(kurok_r1, 0, 14, 0.0F, -1.0F, -4.0F, 0, 4, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}