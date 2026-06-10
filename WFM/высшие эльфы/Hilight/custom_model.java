// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer rightarm2;
	private final ModelRenderer rightarm3;
	private final ModelRenderer rightarm4;
	private final ModelRenderer rightarm5;
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer leftarm4;
	private final ModelRenderer leftarm5;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 24, 48, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.6F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-3.1056F, -1.2863F, 0.0F);
		bipedRightArm.addChild(rightarm2);
		setRotationAngle(rightarm2, 3.1416F, 0.0F, 2.3562F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 18, 11, -3.1444F, -0.7137F, -3.0F, 3, 4, 6, 0.0F, true));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(rightarm3);
		setRotationAngle(rightarm3, 3.1416F, 0.0F, 1.8326F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 10, -1.35F, -3.9F, -3.0F, 3, 5, 6, 0.1F, true));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(-2.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(rightarm4);
		setRotationAngle(rightarm4, 3.1416F, 0.0F, 1.5708F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 18, 0, 0.4F, -2.0F, -3.0F, 2, 5, 6, 0.0F, true));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(5.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(rightarm5);
		setRotationAngle(rightarm5, 0.0F, 3.1416F, 0.0873F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 0, 0, 7.2F, -27.0F, 0.0F, 4, 9, 0, 0.0F, true));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 32, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.66F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, 3.0F);
		bipedBody.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 41, 6, -5.0F, 0.0F, -0.1F, 10, 23, 0, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 24, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.6F, true));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.7544F, -1.3927F, 0.0F);
		bipedLeftArm.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 0.0F, 0.7418F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 18, 11, -1.5F, -2.0F, -3.0F, 3, 4, 6, 0.0F, true));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(1.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(leftarm3);
		setRotationAngle(leftarm3, 0.0F, 0.0F, 1.2654F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 0, 10, -1.5F, -2.9F, -3.0F, 3, 5, 6, 0.1F, true));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(1.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.0F, 0.0F, 1.5708F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 18, 0, 0.4F, -3.0F, -3.0F, 2, 5, 6, 0.0F, true));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(-5.0F, 22.0F, 0.0F);
		bipedLeftArm.addChild(leftarm5);
		setRotationAngle(leftarm5, 0.0F, 0.0F, -0.0873F);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 0, 0, 7.2F, -27.0F, 0.0F, 4, 9, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedRightArm.render(f5);
		bipedBody.render(f5);
		bipedLeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}