// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelAekoldHelbrassBody extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer shoulder_left2;
	private final ModelRenderer horn;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer shoulder_right;
	private final ModelRenderer shoulder_right2;
	private final ModelRenderer shoulder_right3;

	public WFMModelAekoldHelbrassBody() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 3.0F);
		bipedBody.addChild(cape);
		setRotationAngle(cape, 0.3054F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 44, 31, -5.0F, -2.0F, 1.0F, 10, 24, 0, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(7.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, true));

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setRotationPoint(-2.0F, -1.0F, 0.0F);
		bipedLeftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 3.1416F, 0.0F);
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 40, 0, -3.0F, -4.0F, -4.0F, 4, 4, 8, 0.0F, false));

		shoulder_left2 = new ModelRenderer(this);
		shoulder_left2.setRotationPoint(-3.0F, -1.0F, 0.0F);
		shoulder_left.addChild(shoulder_left2);
		setRotationAngle(shoulder_left2, 0.0F, 0.0F, -0.6109F);
		shoulder_left2.cubeList.add(new ModelBox(shoulder_left2, 42, 12, -3.0F, -2.0F, -3.0F, 5, 4, 6, 0.0F, false));

		horn = new ModelRenderer(this);
		horn.setRotationPoint(-4.0F, -3.0F, 0.0F);
		shoulder_left.addChild(horn);
		horn.cubeList.add(new ModelBox(horn, 54, 23, -3.0F, -7.0F, 0.0F, 5, 8, 0, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, false));

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setRotationPoint(0.0F, -1.0F, 0.0F);
		bipedRightArm.addChild(shoulder_right);
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 40, 0, -3.0F, -4.0F, -4.0F, 4, 4, 8, 0.0F, false));

		shoulder_right2 = new ModelRenderer(this);
		shoulder_right2.setRotationPoint(-3.0F, -1.0F, 0.0F);
		shoulder_right.addChild(shoulder_right2);
		setRotationAngle(shoulder_right2, 0.0F, 0.0F, -0.6109F);
		shoulder_right2.cubeList.add(new ModelBox(shoulder_right2, 16, 32, -3.0F, -2.0F, -3.0F, 5, 4, 6, 0.0F, false));

		shoulder_right3 = new ModelRenderer(this);
		shoulder_right3.setRotationPoint(-3.0F, 0.0F, 0.0F);
		shoulder_right2.addChild(shoulder_right3);
		shoulder_right3.cubeList.add(new ModelBox(shoulder_right3, 0, 32, -4.0F, -1.0F, -2.0F, 4, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		bipedLeftArm.render(f5);
		bipedRightArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}