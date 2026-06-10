// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelReiksguardBody extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer shoulder;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer shoulderRight;

	public WFMModelReiksguardBody() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 46, 55, -4.5F, 2.0F, -3.0F, 9, 9, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 46, 55, -4.5F, 2.0F, 3.0F, 9, 9, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 58, 0, -1.2479F, 0.0326F, -3.5F, 3, 3, 0, 0.0F, false));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-1.2479F, -0.4674F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 40, 32, -3.0F, -2.5F, -3.0F, 6, 5, 6, 0.1F, false));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 40, 43, -3.0F, -2.5F, -3.0F, 6, 5, 6, 0.3F, false));

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(-1.1061F, 0.81F, 0.0F);
		RightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.0436F);
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 40, 0, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, false));

		shoulder = new ModelRenderer(this);
		shoulder.setRotationPoint(-0.9914F, -2.8715F, -0.0229F);
		RightArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.0046F, -0.0229F, -0.1289F);
		shoulder.cubeList.add(new ModelBox(shoulder, 0, 53, -1.0F, -2.0F, -3.9769F, 1, 3, 8, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 0, -2.2479F, 0.0326F, -3.5F, 3, 3, 0, 0.0F, true));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 40, 43, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.3F, true));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 40, 32, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.1F, true));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(1.1061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.0436F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 40, 0, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, true));

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setRotationPoint(2.0809F, -3.2741F, 0.2698F);
		LeftArm.addChild(shoulderRight);
		setRotationAngle(shoulderRight, 0.0046F, -0.0229F, 0.0893F);
		shoulderRight.cubeList.add(new ModelBox(shoulderRight, 0, 53, -1.0F, -1.5259F, -3.9769F, 1, 3, 8, 0.0F, false));
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