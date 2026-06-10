// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer leftarm;
	private final ModelRenderer leftarm_r1;
	private final ModelRenderer leftarm_r2;
	private final ModelRenderer leftarm_r3;
	private final ModelRenderer leftarm_r4;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm_r5;
	private final ModelRenderer leftarm_r6;
	private final ModelRenderer leftarm_r7;
	private final ModelRenderer leftarm_r8;
	private final ModelRenderer body;
	private final ModelRenderer head2;
	private final ModelRenderer body_r1;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 24, 32, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, true));
		leftarm.cubeList.add(new ModelBox(leftarm, 24, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.6F, true));

		leftarm_r1 = new ModelRenderer(this);
		leftarm_r1.setRotationPoint(0.7544F, -1.3927F, 0.0F);
		leftarm.addChild(leftarm_r1);
		setRotationAngle(leftarm_r1, 0.0F, 0.0F, 0.7418F);
		leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 18, 11, -1.5F, -2.0F, -3.0F, 3, 4, 6, 0.0F, true));

		leftarm_r2 = new ModelRenderer(this);
		leftarm_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarm_r2);
		setRotationAngle(leftarm_r2, 0.0F, 0.0F, 1.2654F);
		leftarm_r2.cubeList.add(new ModelBox(leftarm_r2, 0, 10, -1.5F, -2.9F, -3.0F, 3, 5, 6, 0.1F, true));

		leftarm_r3 = new ModelRenderer(this);
		leftarm_r3.setRotationPoint(1.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarm_r3);
		setRotationAngle(leftarm_r3, 0.0F, 0.0F, 1.5708F);
		leftarm_r3.cubeList.add(new ModelBox(leftarm_r3, 18, 0, 0.4F, -3.0F, -3.0F, 2, 5, 6, 0.0F, true));

		leftarm_r4 = new ModelRenderer(this);
		leftarm_r4.setRotationPoint(-5.0F, 22.0F, 0.0F);
		leftarm.addChild(leftarm_r4);
		setRotationAngle(leftarm_r4, 0.0F, 0.0F, -0.0873F);
		leftarm_r4.cubeList.add(new ModelBox(leftarm_r4, 0, 0, 7.2F, -27.0F, 0.0F, 4, 9, 0, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-10.0F, 0.0F, 0.0F);
		leftarm.addChild(rightarm);
		rightarm.cubeList.add(new ModelBox(rightarm, 24, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		rightarm.cubeList.add(new ModelBox(rightarm, 24, 48, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.6F, false));

		leftarm_r5 = new ModelRenderer(this);
		leftarm_r5.setRotationPoint(-3.1056F, -1.2863F, 0.0F);
		rightarm.addChild(leftarm_r5);
		setRotationAngle(leftarm_r5, 3.1416F, 0.0F, 2.3562F);
		leftarm_r5.cubeList.add(new ModelBox(leftarm_r5, 18, 11, -3.1444F, -0.7137F, -3.0F, 3, 4, 6, 0.0F, true));

		leftarm_r6 = new ModelRenderer(this);
		leftarm_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(leftarm_r6);
		setRotationAngle(leftarm_r6, 3.1416F, 0.0F, 1.8326F);
		leftarm_r6.cubeList.add(new ModelBox(leftarm_r6, 0, 10, -1.35F, -3.9F, -3.0F, 3, 5, 6, 0.1F, true));

		leftarm_r7 = new ModelRenderer(this);
		leftarm_r7.setRotationPoint(-2.0F, 0.0F, 0.0F);
		rightarm.addChild(leftarm_r7);
		setRotationAngle(leftarm_r7, 3.1416F, 0.0F, 1.5708F);
		leftarm_r7.cubeList.add(new ModelBox(leftarm_r7, 18, 0, 0.4F, -2.0F, -3.0F, 2, 5, 6, 0.0F, true));

		leftarm_r8 = new ModelRenderer(this);
		leftarm_r8.setRotationPoint(5.0F, 22.0F, 0.0F);
		rightarm.addChild(leftarm_r8);
		setRotationAngle(leftarm_r8, 0.0F, 3.1416F, 0.0873F);
		leftarm_r8.cubeList.add(new ModelBox(leftarm_r8, 0, 0, 7.2F, -27.0F, 0.0F, 4, 9, 0, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(5.0F, -2.0F, 0.0F);
		rightarm.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 32, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.66F, false));
		body.cubeList.add(new ModelBox(body, 0, 48, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head2);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 1.0F, 3.0F);
		head2.addChild(body_r1);
		setRotationAngle(body_r1, 0.0209F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 41, 6, -5.0F, -1.0F, -0.1F, 10, 23, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leftarm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}