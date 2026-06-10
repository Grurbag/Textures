// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelParravonKnightBody extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer Pero22_r1;
	private final ModelRenderer cape;
	private final ModelRenderer Cloak_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r4;

	public WFMModelParravonKnightBody() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(4.7113F, 3.5498F, -3.75F);
		Body.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0036F, -0.001F, 0.1746F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 0, 37, -3.5F, -2.75F, -0.05F, 5, 5, 1, -0.4F, false));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(-4.7113F, 3.5498F, -3.75F);
		Body.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0036F, 0.001F, -0.1746F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 0, 37, -1.5F, -2.75F, -0.05F, 5, 5, 1, -0.4F, true));

		Pero22_r1 = new ModelRenderer(this);
		Pero22_r1.setRotationPoint(0.0218F, -10.0928F, 1.6725F);
		Body.addChild(Pero22_r1);
		setRotationAngle(Pero22_r1, 0.5644F, -1.2896F, 0.1596F);
		Pero22_r1.cubeList.add(new ModelBox(Pero22_r1, 17, 50, -2.7218F, 6.0769F, -18.2467F, 0, 9, 5, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, 3.25F);
		Body.addChild(cape);
		

		Cloak_r1 = new ModelRenderer(this);
		Cloak_r1.setRotationPoint(0.0F, 0.0F, -0.5F);
		cape.addChild(Cloak_r1);
		setRotationAngle(Cloak_r1, 0.0873F, 0.0F, 0.0F);
		Cloak_r1.cubeList.add(new ModelBox(Cloak_r1, 40, 43, -6.0F, 2.0F, 0.0F, 12, 21, 0, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 48, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, false));

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setRotationPoint(-1.0F, -0.5F, 0.0F);
		RightArm.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, 0.0F, 0.0F, -0.1309F);
		RightArm_r3.cubeList.add(new ModelBox(RightArm_r3, 40, 0, -3.25F, -2.5F, -3.0F, 6, 5, 6, -0.15F, true));
		RightArm_r3.cubeList.add(new ModelBox(RightArm_r3, 40, 32, -3.25F, -2.5F, -3.0F, 6, 5, 6, 0.1F, true));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, true));

		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setRotationPoint(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, 0.0F, 0.0F, 0.1309F);
		RightArm_r4.cubeList.add(new ModelBox(RightArm_r4, 40, 32, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.1F, false));
		RightArm_r4.cubeList.add(new ModelBox(RightArm_r4, 40, 0, -2.75F, -2.5F, -3.0F, 6, 5, 6, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}