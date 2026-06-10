// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelKislevWarriorHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;

	public WFMModelKislevWarriorHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 9, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 36, -4.0F, -10.0F, -4.0F, 8, 2, 8, 0.1F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-1.0F, -5.5F, -5.25F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, -0.1468F, -0.0257F, -0.1717F);
		head_r1.cubeList.add(new ModelBox(head_r1, 26, 62, -2.0F, -1.5F, 0.0F, 2, 1, 1, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -5.5F, -7.25F);
		Head.addChild(head_r2);
		setRotationAngle(head_r2, -0.149F, 0.0001F, 0.0009F);
		head_r2.cubeList.add(new ModelBox(head_r2, 27, 61, -1.0F, -2.5F, 0.0F, 2, 2, 1, 0.0F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-1.0F, -8.5F, -5.25F);
		Head.addChild(head_r3);
		setRotationAngle(head_r3, -0.1468F, -0.0257F, -0.1717F);
		head_r3.cubeList.add(new ModelBox(head_r3, 27, 62, -1.0F, -1.5F, 0.0F, 1, 1, 1, 0.0F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(1.0F, -8.5F, -5.25F);
		Head.addChild(head_r4);
		setRotationAngle(head_r4, -0.1467F, 0.0259F, 0.1736F);
		head_r4.cubeList.add(new ModelBox(head_r4, 27, 62, 0.0F, -1.5F, 0.0F, 1, 1, 1, 0.0F, false));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(0.0F, -6.5F, -5.25F);
		Head.addChild(head_r5);
		setRotationAngle(head_r5, -0.149F, 0.0001F, 0.0009F);
		head_r5.cubeList.add(new ModelBox(head_r5, 26, 60, -1.5F, -2.5F, -1.0F, 3, 3, 2, 0.0F, false));

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(1.0F, -5.5F, -5.25F);
		Head.addChild(head_r6);
		setRotationAngle(head_r6, -0.1467F, 0.0259F, 0.1736F);
		head_r6.cubeList.add(new ModelBox(head_r6, 27, 62, 0.0F, -1.5F, 0.0F, 2, 1, 1, 0.0F, false));

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r7);
		setRotationAngle(head_r7, 0.0F, 0.0F, 0.0F);
		head_r7.cubeList.add(new ModelBox(head_r7, 0, 22, -2.5F, -2.85F, -3.5F, 5, 2, 5, -0.2F, false));

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(0.0007F, -12.3258F, 5.5959F);
		Head.addChild(head_r8);
		setRotationAngle(head_r8, 0.0873F, 0.0F, 0.0F);
		head_r8.cubeList.add(new ModelBox(head_r8, 52, 28, -1.5F, 0.5F, -1.0F, 3, 4, 3, -0.3F, false));

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(0.0007F, -15.5968F, 1.6515F);
		Head.addChild(head_r9);
		setRotationAngle(head_r9, 1.8762F, 0.0F, 0.0F);
		head_r9.cubeList.add(new ModelBox(head_r9, 32, 16, -2.0F, -3.0F, -1.6F, 4, 6, 4, -0.4F, false));

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(0.0007F, -16.2229F, 3.3459F);
		Head.addChild(head_r10);
		setRotationAngle(head_r10, 0.5236F, 0.0F, 0.0F);
		head_r10.cubeList.add(new ModelBox(head_r10, 48, 16, -2.0F, -2.0F, -2.0F, 4, 8, 4, -0.2F, false));

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(0.0007F, -12.2229F, 0.0459F);
		Head.addChild(head_r11);
		setRotationAngle(head_r11, 0.0F, 0.0F, 0.0F);
		head_r11.cubeList.add(new ModelBox(head_r11, 24, 25, -1.0F, -2.0F, -1.0F, 2, 4, 2, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}